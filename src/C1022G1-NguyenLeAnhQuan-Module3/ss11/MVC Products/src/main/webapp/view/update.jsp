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
<form action="" method="post">
    <div class="form-group">
        <label for="name">Tên sản phẩm</label>
        <input type="text" name="name" id="name" value="${products.name}">
    </div>
    <div class="form-group">
        <label for="price">Giá sản phẩm</label>
        <input type="text" name="price" id="price" value="${products.price}">
    </div>
    <div class="form-group">
        <label for="decription">Mô tả sản phẩm</label>
        <input type="text" name="decription" id="decription" value="${products.decription}">
    </div>
    <div class="form-group">
        <label for="producer">Nhà sản xuất</label>
        <input type="text" name="producer" id="producer" value="${products.producer}">
    </div>
    <input type="submit" value="Thêm mới sản phẩm">
</form>
</body>
</html>
