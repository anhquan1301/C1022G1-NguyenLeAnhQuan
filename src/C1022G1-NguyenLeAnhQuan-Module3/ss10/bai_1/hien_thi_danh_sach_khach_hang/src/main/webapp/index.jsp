<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/10/2023
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Hiển thị danh sách khách hàng</title>
  <link rel="stylesheet" href="\css\bootstrap.css">
</head>
<body>
<h2 class="text-center">Hiển thị danh sách khách hàng</h2>
  <table class="table table-borderlesst table-striped ">
    <thead>
    <tr style="font-weight: bold">
      <td>Tên</td>
      <td>Ngày Sinh</td>
      <td>Địa chỉ</td>
      <td>Ảnh</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
      <tr>
        <td class="col-3" scope="row">${customer.name}</td>
        <td class="col-3" >${customer.birth}</td>
        <td class="col-3" >${customer.address}</td>
        <td class="col-3" ><img style="width: 25%" src="${customer.img}" alt=""></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
<script src="\js\bootstrap.js"></script>
</body>
</html>
