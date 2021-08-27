SELECT user(), database();

show talbes;

INSERT INTO title VALUES(1, '사장');
insert into title values(2, '부장');
INSERT INTO department values(1, '기획', 10);
INSERT INTO employee values(4377, '이성래', 1, NULL, 4500000,1);


desc title;
SELECT tno, tname FROM title;
SELECT tno, tname FROM title where tno = 2;
SELECT deptno, deptname, floor FROM department;
SELECT empno, empname, title, manager, salary, dno FROM employee;

