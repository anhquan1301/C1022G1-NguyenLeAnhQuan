<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/14/2023
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới người dùng</title>
</head>
<body>
<div class="container">
    <h2>Thêm mới người dùng</h2>
    <form action="" method="post">
        <div class="form-group">
            <label for="name">Tên</label>
            <input type="text" name="name" id="name">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" name="email" id="email">

        </div>
        <div class="form-group">
            <label for="country">Quốc gia</label>
            <input type="text" name="country" id="country">
        </div>
        <input type="submit" value="Thêm người mới">
    </form>
</div>
</body>
</html>
