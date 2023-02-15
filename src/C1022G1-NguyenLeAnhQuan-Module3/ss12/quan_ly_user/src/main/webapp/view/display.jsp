<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/14/2023
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hiển thị danh sách người sử dụng</title>
    <link rel="stylesheet" href="\css\bootstrap.css">
</head>
<body>
<h2 class="text-center">Thông tin người sử dụng</h2>
<p>${message}</p>
<div class="container-fluid">
    <div class="row">
        <div class="col-6"><a class="btn btn-dark" href="/user?action=create">Thêm người dùng mới</a></div>
        <div class="col-6">
            <form action="/user" method="get">
                <div class="form-group float-start w-75">
                    <input type="text" name="search" id="search" value="${search}" class="form-control" placeholder="Nhập tên quốc gia người dùng">
                    <input hidden type="text" name="action" value="search" class="form-control">
                </div>
                <div class="float-start w-25">
                    <input class="btn btn-primary" type="submit" value="Search">
                </div>
            </form>
        </div>
    </div>
</div>
<table class="table table-striped">
    <thead>
    <tr>
        <th>ID</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Quốc gia</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${displayList}" var="user" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a class="btn btn-primary" href="/user?action=edit&id=${user.id}">Chỉnh sửa</a></td>
            <td>
                <button onclick="modalDelete('${user.id}','${user.name}')" type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Xóa
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a class="btn btn-light" href="/user?action=sort">Sắp xếp theo tên</a>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/user?action=delete" method="post">
                <div class="modal-body">
                    <label for="id"></label><input type="text" hidden id="id" name="id">
                    Bạn có muốn xóa <span id="name" style="color: brown; font-weight: bold"></span>
                    không ?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                    <button type="submit" class="btn btn-primary">Xóa</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="\js\bootstrap.js"></script>
<script>
    function modalDelete(id, name) {
        document.getElementById("id").value = id;
        document.getElementById("name").innerText = name;
    }
</script>
</body>
</html>
