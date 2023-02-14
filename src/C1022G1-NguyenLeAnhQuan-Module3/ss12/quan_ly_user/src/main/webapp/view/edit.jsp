<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/14/2023
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa thông tin người dùng</title>
</head>
<body>
<h2>Chỉnh sửa thông tin người dùng</h2>
<form action="" method="post">
    <div class="form-group">
        <input type="hidden" name="id">
    </div>
    <div class="form-group">
        <label for="name">Tên</label>
        <input type="text" name="name" id="name" value="${user.name}">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="text" name="email" id="email" value="${user.email}">

    </div>
    <div class="form-group">
        <label for="country">Quốc gia</label>
        <input type="text" name="country" id="country" value="${user.country}">
    </div>
    <input type="submit" value="Xác nhận">
</form>
</body>
</html>
