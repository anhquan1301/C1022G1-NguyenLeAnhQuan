<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/16/2023
  Time: 11:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm khách hàng</title>
</head>
<body>
<form action="" method="post">
    <div class="form-group">
        <label for="name">Tên</label>
        <input type="text"
               class="form-control" name="name" id="name">
    </div>
    <div class="form-group">
        <label for="email">email</label>
        <input type="text"
               class="form-control" name="email" id="email">
    </div>
    <div class="form-group">
        <label for="country">Quốc gia</label>
        <input type="text"
               class="form-control" name="country" id="country">
    </div>
    <div class="form-group">
        <label for="typeSong">Loại xếp hạng</label>
        <select name="typeSong" id="typeSong">
            <c:forEach items="${customerList}" var="customerList">
                <option value="${customerList.}"></option>
            </c:forEach>

        </select>
    </div>
    <input class="btn btn-primary" type="submit" value="Xác nhận">
</form>
</body>
</html>
