drop schema tai_khoan;
create schema tai_khoan;
use tai_khoan;
create table login(
user_name varchar(50),
pass varchar(50)
);
insert into login values('abc','abc123'),('anhquan','abc123'),('minhtruong','abc123'),('ducnghia','abc123');
select * from login;
