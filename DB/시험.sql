/*
아래의 SQL구문은 부서 별 평균 월급이 2800000을 초과하는 부서를 조회한 것이다.
결과가 올바르지 않다고 할 때, 그 원인(20점)과 올바르게 수정한 조치사항(20점)을 각각 항목에 맞게 기술하시오. (총 40점)
*/
SELECT DEPT, SUM(SALARY) 합계, FLOOR(AVG(SALARY)) 평균, COUNT(*) 인원수

FROM EMP

WHERE SALARY > 2800000

GROUP BY DEPT

ORDER BY DEPT ASC;

/*
ROWNUM을 이용해서 월급이 가장 높은 3명을 뽑을려고 하였으나, 올바른 결과가 조회 되지 않았다.
결과가 잘못 조회된 이유를 [원인](30점)에 기술하고, 아래의 구문을 수정하여 [조치내용](30점)에 기술하시오. (총 60점)
*/

[SQL구문]

SELECT ROWNUM, EMPNAME, SAL

FROM EMP

WHERE ROWNUM <= 3

ORDER BY SAL DESC;
-----------------------------------------
/*
아래의 상황과 에러의 내용을 읽고 에러가 발생한 원인(20점)과 그 조치사항(올바른 SQL구문)(20점)을 작성하시오(총 40점)


1) 시나리오 상황

사용자 계정을 만들기 위해 관리자 계정으로 접속하여

CREATE USER EMP IDENTIFIED BY EMP0123; 명령어를 실행한 뒤

접속을 확인하였다.



2) 에러 내용

User EMP이(가) 생성되었습니다.

ORA-01045: user EMP lacks CREATE SESSION privilege; logon denied
*/

/*
다음 두 개의 테이블을 조인하여 EMPNO, EMPNAME, DEPTNO, DEPTNAME 컬럼을 조회하였을 때 문제가 발생한다.
아래의 내용과 문제상황을 보고, 발생한 원인(30점)과 해결할 수 있는 조치사항(30점)을 기술하시오. (총 60점)

-- 사용한 테이블 생성 정보 --

CREATE TABLE DEPARTMENT(

    DEPTCODE NUMBER PRIMARY KEY,

    DEPTNAME NVARCHAR2(10) NOT NULL

);



CREATE TABLE EMPLOYEE(

    EMPNO NUMBER PRIMARY KEY,

    EMPNAME VARCHAR2(10) NOT NULL,

    DEPTNO NUMBER REFERENCES DEPARTMENT(DEPTCODE)

);



-- 실행한 조인 쿼리 --

SELECT EMPNO, EMPNAME, DEPTNO, DEPTNAME

FROM EMPLOYEE

JOIN DEPARTMENT USING(DEPTNO);



-- 문제 상황

ORA-00904: "DEPARTMENT"."DEPTNO": invalid identifier
*/