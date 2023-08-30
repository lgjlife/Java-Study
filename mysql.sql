select * from user;

DROP TABLE IF EXISTS student;
CREATE TABLE student(
   `id` BIGINT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `name` varchar(30) COMMENT "name"
)ENGINE=InnoDB   COMMENT="学生表";

insert into student (name) values ("zhangsan"),("libai");
select * from student;

DROP TABLE IF EXISTS parents;
CREATE TABLE parents(
   `id` BIGINT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `name` varchar(30) COMMENT "name",
   `stu_name` varchar(30) COMMENT "stu_name",
   age INT 
)ENGINE=InnoDB   COMMENT="家长表";

insert into parents (name,stu_name,age) values ("zhangzhongmou","zhangsan",35),("liyongle","libai",46);
select * from parents;
select * from parents where name is not null;
select name as stu_name from student; 


select name from student union all select name from parents;

select * from student union all select * from parents;

select student.name as stu_name from student union select parents.stu_name as stu_name ,parents.name as par_name from parents;  

select * from student where name like "l*bai"



/*连接查询*/

DROP TABLE IF EXISTS emp;
CREATE TABLE emp(
   `id` INT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `name` varchar(30) COMMENT "name",
   `dept_id` INT COMMENT "dept_id" 
)ENGINE=InnoDB   COMMENT="员工表";

insert into emp (name,dept_id) values ("zhangsan",10),("lisi",20),("angwu",80);

select * from emp;


DROP TABLE IF EXISTS dept;
CREATE TABLE dept(
   `id` INT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `dept_id` INT COMMENT "dept_id",
   `dept_name` varchar(30) COMMENT "name"
)ENGINE=InnoDB COMMENT="部门表";

insert into dept (dept_id,dept_name) values (10,"AAA"),(20,"BBB"),(30,"CCC"),(40,"DDD");

select * from dept;

/*迪卡儿积*/
select name,dept_name from emp join dept;
/*内连接*/
select name,dept_name from emp   join dept on  emp.dept_id = dept.dept_id;
select name,dept_name from emp   join dept where  emp.dept_id = dept.dept_id;
/*左外连接*/
select name,dept_name from emp  left join dept on  emp.dept_id = dept.dept_id;

select name,dept_name from emp  left join dept where emp.dept_id = dept.dept_id;

/*右外连接*/
select name,dept_name from emp  right join dept on  emp.dept_id = dept.dept_id;
/*全连接*/
select name,dept_name from emp  left join dept on  emp.dept_id = dept.dept_id
union
select name,dept_name from emp  right join dept on  emp.dept_id = dept.dept_id;




DROP TABLE IF EXISTS tb_students_info;
CREATE TABLE tb_students_info(
   `id` BIGINT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `name` varchar(30) COMMENT "name",
   `course_id` BIGINT
)ENGINE=InnoDB   COMMENT="学生表";

insert into tb_students_info (name,course_id) 
values ("libai",1),("zhangsan",1),("kuis",2),("sanu",2);
select * from tb_students_info;

DROP TABLE IF EXISTS tb_course;
CREATE TABLE tb_course(
   `id` BIGINT  PRIMARY KEY AUTO_INCREMENT COMMENT "ID",
   `course_name` varchar(30) COMMENT "name"
)ENGINE=InnoDB   COMMENT="学生表";


insert into tb_course (id,course_name) 
values (1,"Java"),(2,"cpp");
select * from tb_course;

select name from tb_students_info 
where course_id = (select id from tb_course where course_name = "Java");

select name from tb_students_info  s
join tb_course c
on s.course_id = c.id 
where c.course_name = "Java";