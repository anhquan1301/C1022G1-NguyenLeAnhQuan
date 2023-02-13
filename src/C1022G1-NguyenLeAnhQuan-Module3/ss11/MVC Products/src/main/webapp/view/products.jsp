<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/13/2023
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hiển thị danh sách sản phẩm</title>
    <link rel="stylesheet" href="\css\bootstrap.css">
</head>
<body>
<h2>Hiển thị thông tin sản phẩm</h2>
<form action="/products?action=search" method="post"><label for="name">Tìm kiếm sản phẩm</label>
    <input type="text" name="name" id="name">
    <input type="submit" value="Xác nhận"></form>
<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên sản phẩm</th>
        <th>Giá sản phẩn</th>
        <th>Mô tả sản phẩm</th>
        <th>Nhà sản xuất</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="products" items="${products}" varStatus="loop">
        <tr>
            <td scope="row">${loop.count}</td>
            <td>${products.name}</td>
            <td>${products.price}</td>
            <td>${products.decription}</td>
            <td>${products.producer}</td>
            <td><a class="btn btn-primary" href="/products?action=update&id=${products.id}">update</a></td>
            <td><a class="btn btn-danger" href="/products?action=delete&id=${products.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a class="btn btn-dark" href="/products?action=create">Thêm sản phẩm</a>

<script src="\js\bootstrap.js"></script>
</body>
</html>
