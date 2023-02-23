<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/21/2023
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<h2>Nhập thực phẩm</h2>
<form action="" method="post">
    <table class="table table-striped">
        <thead>
        <tr>
            <th><label for="ten">Tên thực phẩm</label></th>
            <th><label for="ngaySanXuat">Ngày sản xuất</label></th>
            <th><label for="ngayHetHan">Ngày hết hạn</label></th>
            <th><label for="idLoaiThucPham">Loại thực phẩm</label></th>
            <th><label for="moTaThem">Mô tả thêm</label></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td scope="row">
                <input type="text"
                       class="form-control" name="ten" id="ten" required>
            </td>
            <td>
                <input type="date" class="form-control" name="ngaySanXuat" id="ngaySanXuat" required>
            </td>
            <td>
                <input type="date"
                       class="form-control" name="ngayHetHan" id="ngayHetHan" required>
            </td>
            <td>
                <select name="idLoaiThucPham" id="idLoaiThucPham">
                    <c:forEach var="listLoaiThucPham" items="${listLoaiThucPham}">
                    <option value="${listLoaiThucPham.idLoaiThucPham}">${listLoaiThucPham.tenLoaiThucPham}</option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <input type="text"
                       class="form-control" name="moTaThem" id="moTaThem" required>
            </td>
        </tr>

        </tbody>
    </table>
    <input class="btn btn-primary" type="submit" value="Thêm thực phẩm">
</form>
<script src="/js/bootstrap.js"></script>
</body>
</html>
