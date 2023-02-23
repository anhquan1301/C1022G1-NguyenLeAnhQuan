<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/17/2023
  Time: 12:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa thông tin khách hàng</title>
</head>
<body>
<h2>Chỉnh sửa thông tin khách hàng</h2>
<form method="post">
    <div class="form-group">
        <input type="hidden" name="id">
    </div>
    <div class="form-group">
        <label for="name">Tên</label>
        <input type="text"
               class="form-control" name="name" id="name" value="${customer.name}">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="text"
               class="form-control" name="email" id="email" value="${customer.email}">
    </div>
    <div class="form-group">
        <label for="country">Quốc gia</label>
        <input type="text"
               class="form-control" name="country" id="country" value="${customer.country}">
    </div>
    <div class="form-group">
        <label for="typeSong">Loại xếp hạng</label>
        <input type="text"
               class="form-control" name="typeSong" id="typeSong" value="${customer.typeSong}">
    </div>
    <input class="btn btn-primary" type="submit" value="Chỉnh sửa">
</form>
</body>
</html>
