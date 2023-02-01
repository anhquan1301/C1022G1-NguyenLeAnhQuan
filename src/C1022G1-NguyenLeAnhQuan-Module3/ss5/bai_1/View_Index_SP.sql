-- Bước 1
drop schema demo;
create schema demo;
use demo;
-- Bước 2
CREATE TABLE Products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_code VARCHAR(50),
    product_name VARCHAR(50),
    product_price INT,
    product_amount INT,
    product_description VARCHAR(50),
    product_status VARCHAR(50)
);
insert into Products(product_code,product_name,product_price,product_amount,product_description,product_status) 
values
('IP01','Iphone 14', 1500, 10 ,'Gold ProMax','100%'),
('IP02','Iphone 13', 900, 5 ,'Black ProMax','100%'),
('IP03','Iphone 12', 400, 3 ,'White ProMax','99%');
-- Bước 3
SELECT 
    *
FROM
    Products;
create unique index index_product_code on Products(product_code);
create index index_product_name_and_price on Products(product_name,product_price);
explain select * from Products
where product_code = 'IP01';
explain select * from Products
where product_name = 'Iphone 14';
explain select * from Products
where product_price = 400;
drop index index_product_code on Products;
drop index index_product_name_and_price on Products;
-- Bước 4
CREATE VIEW view_products (product_code , product_name , product_price , product_status) AS
    SELECT 
        product_code, product_name, product_price, product_status
    FROM
        products;
SELECT 
    *
FROM
    view_products;
UPDATE view_products 
SET 
    product_price = 450
WHERE
    product_name = 'Iphone 12';
-- Bước 5
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter // create procedure information_products() begin 
select 
  * 
from 
  products;
end // delimiter;
call information_products;
-- Tạo store procedure thêm một sản phẩm mới
delimiter // create procedure add_products(
  product_code varchar(50), 
  product_name varchar(50), 
  product_price int, 
  product_amount int, 
  product_description varchar(50), 
  product_status varchar(50)
) begin insert into products(
  product_code, product_name, product_price, 
  product_amount, product_description, 
  product_status
) 
values 
  (
    product_code, product_name, product_price, 
    product_amount, product_description, 
    product_status
  );
end // delimiter;
call add_products(
  'IP04', 'IPhoneX', 100, 
  7, 'Gold XS', '100%'
);
-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter // create procedure update_by_id(
  id int, 
  product_code varchar(50), 
  product_name varchar(50), 
  product_price int, 
  product_amount int, 
  product_description varchar(50), 
  product_status varchar(50)
) begin 
update 
  products 
set 
  products.product_code = product_code, 
  products.product_name = product_name, 
  products.product_price = product_price, 
  products.product_amount = product_amount, 
  products.product_description = product_description, 
  products.product_status = product_status 
where 
  products.id = id;
end // delimiter;
call update_by_id (2,'Ip02', 'Iphone11', 300, 3,'Pro', '98%');
-- Tạo store procedure xoá sản phẩm theo id
delimiter // create procedure delete_by_id (id int) begin 
delete from 
  products 
where 
  products.id = id;
end // delimiter;
call delete_by_id(3);