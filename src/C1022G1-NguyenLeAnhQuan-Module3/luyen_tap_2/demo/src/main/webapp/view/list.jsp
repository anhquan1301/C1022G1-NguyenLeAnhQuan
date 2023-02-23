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
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<h2>Danh sách học sinh</h2>
<a class="btn btn-dark" href="/student?action=create">Thêm học sinh mới</a>
<form action="" method="get">
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
        <th>Điểm</th>
        <th>Tên lớp học</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${studentList}" varStatus="stt">
    <tr>
        <td scope="row">${stt.count}</td>
        <td>${student.name}</td>
        <td>${student.score}</td>
        <td>${student.className.name}</td>
        <td><a class="btn btn-primary" href="/student?action=edit&id=${student.id}">Chỉnh sửa</a></td>
        <td>
            <button onclick="deleteId('${student.id}','${student.name}')" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Xóa
            </button>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Xóa</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/student" method="get">
            <div class="modal-body">
                <input type="hidden" name="id" id="id">
                Bạn có chắc chắn muốn xóa <span id="name" style="color: brown"></span> không?
            </div>
            <div class="modal-footer">
                <input type="hidden" name="action" value="delete">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                <button type="submit" class="btn btn-danger">Xóa</button>
            </div>
            </form>
        </div>
    </div>
</div>
<script src="/js/bootstrap.js"></script>
<script>
    function deleteId(id,name){
        document.getElementById("id").value=id;
        document.getElementById("name").innerText = name;
        debugger;
    }
</script>
</body>
</html>
