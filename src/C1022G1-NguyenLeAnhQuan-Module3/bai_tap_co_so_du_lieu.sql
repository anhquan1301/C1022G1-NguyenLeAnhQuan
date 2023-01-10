create schema student_management;
use  student_management;
create table class (
	id int,
    `name` varchar(50),
    primary key (id)
    );
create table teacher (
	id int,
    `name` varchar(50),
    age int,
    country varchar(50),
    primary key (id)
);
insert into class (id, `name`) values (1,"Duy Tân University");
insert into class (id, `name`) values (2,"CodeGym");
select * from class;
insert into teacher (id,`name`,age,country) values (1,"Nguyễn Văn A", 28, "Đà Nẵng");
insert into teacher (id,`name`,age,country) values (2,"Trần Văn B", 18, "Đà Nẵng");
select * from teacher;    