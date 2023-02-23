<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/21/2023
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sửa thông tin sản phẩm</h2>
<form action="" method="post">
    <div>
        <input type="hidden" name="id">
    </div>
    <div class="form-group">
        <label for="name">Tên sản phẩm</label>
        <input type="text"
               class="form-control" name="name" id="name" value="${productList.name}">
    </div>
    <div class="form-group">
        <label for="price">Giá sản phẩm</label>
        <input type="text"
               class="form-control" name="price" id="price" value="${productList.price}">
    </div>
    <div class="form-group">
        <label for="idTypeProduct">Loại sản phẩm</label>
        <select name="idTypeProduct" id="idTypeProduct">
            <c:forEach var="typeProductList" items="${typeProductList}">
                <option value="${typeProductList.idTypeProduct}">${typeProductList.nameTypeProduct}</option>
            </c:forEach>
        </select>
    </div>
    <input type="submit" value="Xác nhận">
</form>
</body>
</html>
