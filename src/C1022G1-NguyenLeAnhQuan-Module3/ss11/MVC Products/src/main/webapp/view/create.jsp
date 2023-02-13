<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/13/2023
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm vào sản phẩm mới</title>
</head>
<body>
<div class="container">
    <h2>Thêm mới sản phẩm</h2>
    <form action="" method="post">
        <div class="form-group">
            <label for="name">Tên sản phẩm</label>
            <input type="text" name="name" id="name" class="form-control">
        </div>
        <div class="form-group">
            <label for="price">Giá sản phẩm</label>
            <input type="text" name="price" id="price" class="form-control">
        </div>
        <div class="form-group">
            <label for="decription">Mô tả sản phẩm</label>
            <input type="text" name="decription" id="decription" class="form-control">
        </div>
        <div class="form-group">
            <label for="producer">Nhà sản xuất</label>
            <input type="text" name="producer" id="producer" class="form-control">
        </div>
        <div><input type="submit" value="Thêm sản phẩm mới"></div>
    </form>
</div>
</body>
</html>
