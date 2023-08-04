/*
join 문법
-- 테이블1의 외래키가 테이블2의 기본키를 참조하는 경우
-- JOIN은 일반적으로 외래키와 기본키를 연결하지만, 상황에 따라서는 외래키가 아닌 속성을 기본키와 연결할 수 있다.
SELECT 
	테이블1.속성명1, 테이블1.속성명2,...,테이블2.속성명1, 테이블2.속성명2,...
FROM
	테이블1
INNER JOIN | LEFT INNER | RIGHT JOIN -- INNER 조인과 OUTER 조인 둘다 가능 -- INNER JOIN은 INNER를 생략가능
	테이블2
ON
	테이블1.외래키 = 테이블2.기본키
[INNER JOIN | LEFT INNER | RIGHT JOIN
	테이블3
ON
	테이블1.외래키 = 테이블3.기본키]
[WHERE 절]
[GROUP BY절]
[HAVING절]
[ORDER BY절]
[LIMIT절]
*/
select
	COURSE.*, TITLE
FROM
	COURSE
JOIN
	SUBJECT
ON
	COURSE.SUBJECT_CODE = SUBJECT.CODE; 

-- 대학물리를 수강하는 학생들 수를 조회하는 쿼리

select 
	subject_code as 과목코드, count(*) as 수강생수
FROM 
	COURSE 
WHERE 
	subject_code in (select 
				code 
			from 
				subject 
			where 
				title = '대학물리')
group by subject_code;

select 
	subject_code as 과목코드, count(*) as 수강생 
from 
	course
join
	subject
on
	subject_code = code
where
	title = '대학물리'
group by subject_code;

-- 유재석 학생이 수강하는 과목의 수를 조회하는 쿼리
select 
	student_num as 유재석학번, count(*) as 수강과목수
from 
	course 
where 
	student_num = (select num from student where name = '유재석')
group by student_num;


select
	student_num as 유재석학번, count(*) as 수강생
from 
	course
join
	student
on
	student_num = student.num 
where
	name = '유재석'
group by 
	student_num;
    
-- 유재석 학생이 수강하는 과목명을 조회하는 쿼리
    
select
	name as 이름, title as 수강과목
from
	course
join
	student
on
	student_num = student.num
join
	subject
on
	subject_code = subject.code
where
	name = '유재석'
group by
	subject_code;
    
-- 이순신 교수님이 강의하는 과목명을 조회하는 쿼리

select distinct
	title as 강의명, professor_name as 교수
from
	course
join
	subject
on
	subject_code = code
where
	professor_name = '이순신';

    
    









