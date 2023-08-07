select * from a join b on A.a = B.b;
select * from b join a on A.a = B.b; -- 둘의 결과는 같음

-- qwe123회원이 구매{환불 반품을 제외한}한 제품과 옵션 목록을 확인하는 쿼리
select 
	or_me_id as 주문아이디, 
	pr_name as 제품명,
	op_name as 옵션명,
    pr_price as 제품가격,
    ol_amount as 구매수량
from `order`
	join order_list on ol_or_num = or_num
    join `option` on ol_op_num = op_num
    join product on op_pr_code = pr_code
    where or_state not in('환불', '반품') and or_me_id = 'qwe123';
   
-- abc123회원이 장바구니에 담은 제품명과 옵션명, 수량을 확인하는 쿼리
select 
	ba_me_id as 회원아이디,
	pr_name as 제품명,
    op_name as 옵션명,
	ba_amount as 수량
from basket
	join `option`
    on ba_op_num = op_num
    join product 
    on op_pr_code = pr_code
where 
	ba_me_id = 'abc123';
   
-- abc123회원이 등록한 배송지 정보를 조회하는 쿼리
SELECT 
    *
FROM
    address
WHERE
    ad_me_id = 'abc123';

-- 등록된 모든 제품을 검색하는 쿼리
select * from product;

-- KH가 제품명에 포함된 제품들을 검색하는 쿼리
select
	*
from
	product
where
	pr_name like concat('%', 'kh', '%');

-- kh가 제품명에 포함된 제품들 중에서 1페이지에 해당하는 제품들을 검색하는 쿼리(한 페이지에는 제품이 최대 5개)
select
	*
from
	product
where
	pr_name like concat('%', 'kh', '%')
limit
	0, 5;
-- kh가 제품명에 포함된 제품들 중에서 1페이지에 해당하는 제품들을 검색하는 쿼리(한 페이지에는 제품이 최대 5개)
select
	*
from
	product
where
	pr_name like concat('%', 'kh', '%')
limit
	5, 5;
    
-- abc123회원이 작성한 모든 리뷰를 조회하는 쿼리

select
	*
from 
	review
where
	re_me_id = 'abc123';
	
-- abc123회원이 작성한 리뷰가 있는 제품명을 조회

select
	pr_name as 리뷰제품
from 
	review
join
	`option`
on
	re_op_num = op_num
join 
	product 
on 
	pr_code = op_pr_code
where
	re_me_id = 'abc123';

-- 제품 코드가 ABC001이고, 옵션명이 무선인 제품에 달린 리뷰를 조회
select
	*
from
	review
join
	`option`
on
	re_op_num = op_num
where
	op_pr_code = 'abc123'
and    
    op_name = '무선';
    
-- 제품명이 kh무선마우스인 제품의 리뷰 개수를 조회하는 쿼리
select
	count(*) as 'kh무선마우스 리뷰수'
from 
	review
join
	`option`
on
	re_op_num = op_num
where
	op_pr_code = (select pr_code from product where pr_name = 'kh무선마우스');

-- 제품별 리뷰 개수를 조회하는 쿼리(리뷰가 등록된 제품만 조회)

select
	op_pr_code as 제품코드,
	count(*) as 리뷰수
from 
	review
join
	`option`
on
	op_num = re_op_num 
group by
	op_pr_code;

-- 제품별 옵션의 개수를 조회하는 쿼리(제품명, 옵션수)
SELECT
	PR_NAME AS 제품명,
	COUNT(*) AS 옵션수
FROM
    PRODUCT
JOIN
	`OPTION`
ON
	PR_CODE = OP_PR_CODE
GROUP BY
	PR_CODE;
   
-- 제품별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 판매량)
SELECT
	PR_NAME AS 제품명,
	SUM(OL_AMOUNT) AS 판매량
FROM
    PRODUCT
JOIN
	`OPTION`
ON
	OP_PR_CODE = PR_CODE
LEFT JOIN
	ORDER_LIST
ON
	OL_OP_NUM = OP_NUM
LEFT JOIN
	`ORDER` 
ON 
	OR_NUM = OL_OR_NUM
WHERE
	OR_STATE IS NULL OR OR_STATE NOT IN('반품','환불')
GROUP BY PR_CODE;
-- 제품 옵션별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 옵션명, 판매량)
SELECT
	PR_NAME AS 제품명,
    OP_NAME AS 옵션명,
	IFNULL(SUM(OL_AMOUNT),0) AS 판매량
FROM
    PRODUCT
JOIN
	`OPTION`
ON
	OP_PR_CODE = PR_CODE
LEFT JOIN
	ORDER_LIST
ON
	OL_OP_NUM = OP_NUM
LEFT JOIN
	`ORDER` 
ON 
	OR_NUM = OL_OR_NUM
WHERE
	OR_STATE IS NULL OR OR_STATE NOT IN('반품','환불')
GROUP BY OP_NUM;

-- 제품 옵션별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 옵션명, 판매량, 총판매금액)
SELECT
	PR_NAME AS 제품명,
    OP_NAME AS 옵션명,
	IFNULL(SUM(OL_AMOUNT),0) AS 판매량,
    PR_PRICE * IFNULL(SUM(OL_AMOUNT),0) AS 총판매금액
FROM
    PRODUCT
JOIN
	`OPTION`
ON
	OP_PR_CODE = PR_CODE
LEFT JOIN
	ORDER_LIST
ON
	OL_OP_NUM = OP_NUM
LEFT JOIN
	`ORDER` 
ON 
	OR_NUM = OL_OR_NUM
WHERE
	OR_STATE IS NULL OR OR_STATE NOT IN('반품','환불')
GROUP BY OP_NUM;
-- 옵션별 리뷰수를 조회하는 쿼리(제품명, 옵션명, 리뷰수)
SELECT
	PR_NAME AS 제품명, OP_NAME AS 옵션명, COUNT(RE_NUM) AS 리뷰수
FROM
	REVIEW
RIGHT JOIN
	`OPTION`
ON
	RE_OP_NUM = OP_NUM
JOIN
	product
ON
	OP_PR_CODE = PR_CODE
GROUP BY OP_NUM;





