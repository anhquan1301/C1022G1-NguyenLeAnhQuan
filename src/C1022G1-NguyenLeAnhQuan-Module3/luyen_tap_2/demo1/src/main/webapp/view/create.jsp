<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/21/2023
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Thêm sản phẩm</h2>
<form action="" method="post">
<div class="form-group">
  <label for="name">Tên sản phẩm</label>
  <input type="text"
         class="form-control" name="name" id="name" pattern="^PD[0-9]{3}$">
</div>
<div class="form-group">
  <label for="price">Giá sản phẩm</label>
  <input type="number"
         class="form-control" name="price" id="price" >
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
