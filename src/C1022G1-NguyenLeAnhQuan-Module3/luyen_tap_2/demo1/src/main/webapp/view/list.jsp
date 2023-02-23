<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/21/2023
  Time: 9:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<table class="table">
  <thead>
  <a class="btn btn-dark" href="/product?action=create">Thêm sản phẩm</a>
  <form action="" method="get">
  <div class="form-group">
    <input type="text"
           class="form-control" name="search" id="" aria-describedby="helpId" value="${name}" placeholder="Tìm kiếm sản phẩm">
  </div>
    <div>
      <input type="submit" value="Tìm kiếm">
    </div>
  </form>
  <tr>
    <th>STT</th>
    <th>Tên sản phẩm</th>
    <th>Giá sản phâm</th>
    <th>Loại sản phẩm</th>
    <th></th>
    <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach varStatus="stt" items="${productList}" var="productList">
  <tr>
    <td scope="row">${stt.count}</td>
    <td>${productList.name}</td>
    <td>${productList.price}</td>
    <td>${productList.typeProduct.nameTypeProduct}</td>
    <td>
      <a href="/product?action=edit&id=${productList.id}" class="btn btn-primary" type="button">Chỉnh sửa</a>
    </td>
    <td>
      <button onclick="deleteId('${productList.id}','${productList.name}')" type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
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
        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="/product" method="get">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="id" id="deleteId">
      <div class="modal-body">
        Bạn có chắc chắn muốn xóa <span id="deleteName" style="color: brown"></span>
        không?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
      </form>
    </div>
  </div>
</div>
<script src="/js/bootstrap.js">
</script>
<script>
  function deleteId(id,name){
    document.getElementById("deleteId").value=id;
    document.getElementById("deleteName").innerText=name;
  }
</script>
</body>
</html>
