<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/13/2023
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cập nhật thông tin sản phẩm</title>
</head>
<body>
<h2>Cập nhật thông tin sản phẩm</h2>
<form action="">
    <div class="form-group">
        <label for="idUpDate">Nhập id sản phẩm</label>
        <input type="text" name="idUpDate" id="idUpDate" class="form-control">
    </div>
    <div class="form-group">
        <label for="nameUpDate">Nhập tên cần sửa</label>
        <input type="text" name="nameUpDate" id="nameUpDate" class="form-control">
    </div>
    <div class="form-group">
        <label for="priceUpDate">Nhập giá cần sửa</label>
        <input type="text" name="priceUpDate" id="priceUpDate" class="form-control">
    </div>
    <div class="form-group">
        <label for="decripUpDate">Nhập mô tả sản phẩm cần sửa</label>
        <input type="text" name="decripUpDate" id="decripUpDate" class="form-control">
    </div>
    <div class="form-group">
        <label for="producerUpDate">Nhập nhà sản xuất cần sửa</label>
        <input type="text" name="producerUpDate" id="producerUpDate" class="form-control">
    </div>
    <input type="submit" value="Cập nhật thông tin">
</form>
</body>
</html>
