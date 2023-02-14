
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/14/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hiển thị danh sách người sử dụng</title>
    <link rel="stylesheet" href="\css\bootstrap.css">
</head>
<body>
<h2 class="text-center">Thông tin người sử dụng</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Tên</th>
            <th>Email</th>
            <th>Quốc gia</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${displayList}" var="user" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td><a class="btn btn-primary" href="/user?action=edit&id=${user.id}">Chỉnh sửa</a></td>
                <td><a class="btn btn-danger" href="/user?action=delete&id=${user.id}">Xóa</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
<a class="btn btn-dark" href="/user?action=create">Thêm người dùng mới</a>
<script url="\js\bootstrap.js"></script>
</body>
</html>
