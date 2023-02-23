<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/20/2023
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xóa học sinh</title>
</head>
<body>
<form action="" method="post">
  <input type="hidden" name="id">
  <div class="form-group">
    <label for="name"></label>
    <input type="text"
           class="form-control" name="name" id="name" value="${studentList.name}">
  </div>
  <div class="form-group">
    <label for="score"></label>
    <input type="text" name="score" id="score" value="${studentList.score}">

  </div>
  <div class="form-group">
    <label for="classId"></label>
    <select name="classId" id="classId">
      <c:forEach var="classList" items="${classList}" >
      <option value="${classList.id}">${classList.name}</option>
      </c:forEach>
    </select>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
