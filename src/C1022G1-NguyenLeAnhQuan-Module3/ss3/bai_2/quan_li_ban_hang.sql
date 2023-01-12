CREATE SCHEMA quan_li_ban_hang;
USE quan_li_ban_hang;
CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(50),
    customer_age TINYINT
);
CREATE TABLE `order` (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    order_date DATETIME,
    order_total_price INT,
    customer_id INT,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
CREATE TABLE product (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(50),
    product_price INT
);
CREATE TABLE order_detail (
    order_id INT,
    product_id INT,
    order_detail_QTY INT,
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
        REFERENCES `order` (order_id),
    FOREIGN KEY (product_id)
        REFERENCES product (product_id)
);
												-- NHẬP DỮ LIỆU VÀO BẢNG --
insert into customer(customer_name,customer_age) values ('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);
insert into `order`(order_date,order_total_price,customer_id) values('2006/3/21',null,1),('2006/3/23',null,2),('2006/3/16',null,1);
insert into product (product_name,product_price) values('May Giat',3),('Tu Lanh',5),('Dieu Hoa',7),('Quat',1),('Bep Dien',2);
insert into order_detail(order_id,product_id,order_detail_QTY) values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
-- drop schema quan_li_ban_hang;
SELECT 
    order_id, order_date, order_total_price
FROM
    `order`;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
-- 1.Hiển thị danh sách các khách hàng đã mua hàng
SELECT 
    customer_name, order_date
FROM
    `order`
        JOIN
    customer ON `order`.customer_id = customer.customer_id;
-- 2.Hiển thị danh sách sản phẩm được mua bởi các khách
SELECT 
    customer_name, product_name, order_date
FROM
    order_detail
        JOIN
    product ON order_detail.product_id = product.product_id
        JOIN
    `order` ON order_detail.order_id = `order`.order_id
        JOIN
    customer ON `order`.customer_id = customer.customer_id;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT 
    *
FROM
    customer
WHERE
    customer.customer_name NOT IN (SELECT 
            customer_name
        FROM
            `order`
                JOIN
            customer ON `order`.customer_id = customer.customer_id);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
SELECT 
    `order`.order_id,
    `order`.order_date,
    order_detail.order_detail_QTY * product.product_price AS 'order_total_price'
FROM
    `order`
        JOIN
    order_detail ON `order`.order_id = order_detail.order_id
        JOIN
    product ON order_detail.product_id = product.product_id;