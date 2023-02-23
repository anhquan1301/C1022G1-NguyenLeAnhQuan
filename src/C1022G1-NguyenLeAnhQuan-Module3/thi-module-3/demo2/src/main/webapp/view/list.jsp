<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/21/2023
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách thực phẩm</title>
  <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<h2>Hiển thị danh sách thực phẩm</h2>
  <div>
    <a class="btn btn-dark" href="/thucpham?action=create">Nhập thực phẩm</a>
</div>
<table class="table table-striped">
  <thead>
  <tr>
    <th>Mã thực phẩm</th>
    <th>Tên thực phẩm</th>
    <th>Ngày sản xuất</th>
    <th>Ngày hết hạn</th>
    <th>Loại thực phẩm</th>
    <th>Mô tả thêm</th>
    <th>Chức năng</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="listThucPham" items="${listThucPham}" varStatus="stt">
  <tr>
    <td scope="row">${stt.count}</td>
    <td>${listThucPham.ten}</td>
    <td>${listThucPham.ngaySanXuat}</td>
    <td>${listThucPham.ngayHetHan}</td>
    <td>${listThucPham.loaiThucPham.tenLoaiThucPham}</td>
    <td>${listThucPham.moTaThem}</td>
    <td>
      <button onclick="deleteId('${listThucPham.id}','${listThucPham.ten}')" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
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
        <h1 class="modal-title fs-5" id="exampleModalLabel">Xác nhận xóa</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="/thucpham" method="get">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="id" id="deleteId">
      <div class="modal-body">
        Bạn có muốn xóa thực phẩm <span id="deleteName" style="color: brown"></span>
        không?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
        <button type="submit" class="btn btn-primary">Xóa</button>
      </div>
      </form>
    </div>
  </div>
</div>
<script src="/js/bootstrap.js"></script>
<script>
  function deleteId(id,name){
    debugger
    document.getElementById("deleteId").value = id;
    document.getElementById("deleteName").innerText = name;
  }
</script>
</body>
</html>
