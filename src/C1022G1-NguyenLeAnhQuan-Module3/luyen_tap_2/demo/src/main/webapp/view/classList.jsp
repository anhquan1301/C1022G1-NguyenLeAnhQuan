<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/18/2023
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Danh sách học sinh</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
          crossorigin="anonymous"></script>
</head>
<body>
<h2>Danh sách học sinh</h2>
<a class="btn btn-dark" href="/student?action=create">Thêm học sinh mới</a>
<form action="/student" method="get">
  <div class="form-group">
    <input type="text"
           class="form-control" name="search" id="search" placeholder="Nhập tên cần tìm" value="${search}">
  </div>
  <div>
    <input type="submit" value="Tìm kiếm">
  </div>
</form>
<table class="table table-striped">
  <thead>
  <tr>
    <th>STT</th>
    <th>Tên</th>
    <th></th>
    <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="class" items="${classList}" varStatus="stt">
    <tr>
      <td scope="row">${stt.count}</td>
      <td>${class.name}</td>
      <td><a class="btn btn-primary" href="">Chỉnh sửa</a></td>
      <td><button>Xóa</button></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
