create schema thuc_hanh;
create table student (
id int,
`name` varchar(50),
score double,
primary key (id)
);
insert into student (id,`name`,score) values (1,"Nguyễn Văn A", 9.5);
update student
set score = 10
where id = 1;
alter table student add class varchar(50);
update student
set class = "C1022G1"
where id = 1;
insert into student (id,`name`,score,class) values (2,"Trần Trọng Nghĩa", 1.5, "Lớp du"); 
alter table student add age int;
update student
set age = 18;
select id "Mã học sinh", `name` "Tên học sinh", score "Điểm", class "Lớp", age "Tuổi" from student;