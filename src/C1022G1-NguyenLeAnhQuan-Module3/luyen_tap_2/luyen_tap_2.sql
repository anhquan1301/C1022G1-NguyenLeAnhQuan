drop schema luyen_tap_2;
create schema luyen_tap_2;
use luyen_tap_2;
create table class(
id int primary key auto_increment,
name varchar(50)
);
create table student(
id int primary key auto_increment,
name varchar(50),
score varchar(50),
class_id int,
foreign key (class_id) references class(id)
);
insert into class (name) values ('C1022g1'),('C1122g1'),('C1222g1');
insert into student(name,score,class_id) values ('Nguyễn Văn A',5.5,1),('Nguyễn Văn B',6.5,2),('Nguyễn Văn C',7.5,3);
select * from class;
select * from student;
select s.name, s.score, c.name from student s join class c on s.class_id = c.id where s.name like concat("%",?,"%");