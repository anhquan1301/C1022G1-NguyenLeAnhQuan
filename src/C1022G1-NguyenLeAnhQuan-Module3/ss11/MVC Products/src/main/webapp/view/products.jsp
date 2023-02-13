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
</head>
<body>
<h2>Hiển thị thông tin sản phẩm</h2>
<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên sản phẩm</th>
        <th>Giá sản phẩn</th>
        <th>Mô tả sản phẩm</th>
        <th>Nhà sản xuất</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="products" items="${productsList}" varStatus="loop">
        <tr>
            <td scope="row">${loop.count}</td>
            <td>${products.name}</td>
            <td>${products.price}</td>
            <td>${products.decription}</td>
            <td>${products.producer}</td>
            <td><a href="/products?action=update">update</a></td>
            <td><a href="">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a class="button-bar" href="/products?action=create">Thêm sản phẩm</a>
</body>
</html>
