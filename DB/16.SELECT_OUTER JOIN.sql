/*
INNER JOIN : 두 테이블이 외래키로 연결 되었을 때, 양쪽 다 데이터가 있는 경우
OUTER JOIN : 두 테이블이 외래키로 연결 되었을 때, 한 테이블을 기준으로 연결할 때 사용


- 상품별 리뷰수를 조회하는 경우, 리뷰가 등록이 안된 상품들을 INNER JOIN을 이용해서 알 수가 없음

- OUTER JOIN 문법 : 기준 테이블이 매우 중요. 
  INNER JOIN은 A JOIN B, B JOIN A가 같지만
  OUTER JOIN은 A OUTER JOIN B 와 B OUTER JOIN A는 결과가 다름
- 종류 : LEFT, RIGHT
- LEFT JOIN : 기준 테이블을 기준으로 연결
- RIGHT JOIN : 참조 테이블을 기준으로 연결

A LEFT JOIN B == B RIGHT JOIN A
 
SELECT * FROM 기준테이블
	JOIN 참조테이블
    ON 기준테이블.외래키 = 참조테이블.기본키;
[WHERE절]
[GROUP BY]
[HAVING절]
[ORDER BY절]
[LIMIT절]
*/

-- 제품별 리뷰 개수를 조회하는 쿼리
select
	op_pr_code as 제품코드,
	count(RE_NUM) as 리뷰수
from 
	review
RIGHT join
	`option`
on
	op_num = re_op_num 
group by
	op_pr_code;

	



