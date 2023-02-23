drop schema luyen_tap_3;
create schema luyen_tap_3;
use luyen_tap_3;

create table type_product(
id_type_product int primary key auto_increment,
name_type_product varchar(50)
);

create table product(
 id int primary key auto_increment,
 name varchar(50),
 price int,
 id_type_product int,
 foreign key(id_type_product) references type_product(id_type_product)
);
insert into type_product (name_type_product) values ('SmartPhone'),('Laptop'),('PC'),('Tablet');
insert into product(name,price,id_type_product) values('Iphone14',1500,1),('Asus Zenbook',1000,2);
select * from type_product;
select * from product;
select p.id,p.name,p.price,t.name_type_product from product p join type_product t on p.id_type_product = t.id_type_product;
delete from product where id = 3;
