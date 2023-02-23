<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/16/2023
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="\css\bootstrap.css">
</head>
<h2>Danh sách khách hàng</h2>
<body>
<div class="row">
    <div class="col-6"><a class="btn btn-dark" href="/customer?action=create">Thêm mới khách hàng</a></div>
    <div class="col-6">
        <form method="get">
            <div class="form-group">
                <div>
                    <input type="text"
                            class="form-control" name="search" id="search" placeholder="Nhập tên cần tìm">
                </div>
                <div>
                    <input class="btn btn-primary" type="submit" value="Tìm kiếm">
                </div>
            </div>
        </form>
    </div>
</div>
<table class="table table-striped">
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Quốc gia</th>
        <th>Loại xếp hạng</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="customer" items="${customerList}" varStatus="loop">
    <tr>
        <td scope="row">${loop.count}</td>
        <td>${customer.name}</td>
        <td>${customer.email}</td>
        <td>${customer.country}</td>
        <td>${customer.typeSong}</td>
        <td><a class="btn btn-primary" href="/customer?action=edit&id=${customer.id}">Chỉnh sửa</a></td>
        <td>
            <button onclick="deleteId(${customer.id})" type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Xóa
            </button>
        </td>
    </tr>
</c:forEach>
    </tbody>
</table>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Bạn có chắc chắn muốn xóa không
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                <form action="/customer" method="get">
                    <input type="hidden" name="action" value="delete">
                    <input type="hidden" id="deleteId" name="deleteId">
                    <button type="submit" class="btn btn-primary">Xóa</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="\js\bootstrap.js"></script>
<script>
    function deleteId(deleteId) {
        document.getElementById("deleteId").value = deleteId;
        debugger;
    }
</script>
</body>
</html>
