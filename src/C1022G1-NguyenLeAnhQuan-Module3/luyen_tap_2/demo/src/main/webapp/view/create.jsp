<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/18/2023
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm học sinh</title>
</head>
<body>
<h2>Thêm học sinh mới</h2>
<form action="" method="post">
    <div class="form-group">
        <label for="name">Nhập tên</label>
        <input type="text"
               class="form-control" name="name" id="name" >
    </div>
    <div class="form-group">
        <label for="score">Nhập điểm</label>
        <input type="text"
               class="form-control" name="score" id="score" >
    </div>
    <div class="form-group">
        <label for="className">Nhập tên lớp</label>
        <select name="className" id="className">
            <c:forEach var="classList" items="${classList}" varStatus="loop">
                <option value="${classList.id}">${classList.name}</option>
            </c:forEach>
        </select>
<%--        <input type="text" class="form-control" name="className" id="className">--%>
    </div>
    <input type="submit" value="Xác nhận">
</form>
</body>
</html>
