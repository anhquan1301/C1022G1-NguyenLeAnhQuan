<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/9/2023
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <title>Ứng dụng Product Discount Calculator</title>
  <link rel="stylesheet" href="css\bootstrap.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="calculator" method="post">
  <table class="m-3">
    <tr style="height: 40px">
      <th>
        <label for="pd">Product Description &nbsp;</label>
      </th>
      <th>
        <input type="text" name="productdescription" id="pd" placeholder="Input Product Description">
      </th>
    </tr>
    <tr style="height: 40px">
      <th>
        <label for="lp">List Price</label>
      </th>
      <th>
        <input type="text" name="listprice" id="lp" placeholder="Input List Price">
      </th>
    </tr>
    <tr style="height: 40px">
      <th>
        <label for="dp">Discount Percent</label>
      </th>
      <th>
        <input type="text" name="discountpercent" id="dp" placeholder="Input Discount Percent">
      </th>
  </table>
  <button class="m-3" value="submit">Calculate Discount</button>
</form>

<script scr="js\bootstrap.js"></script>
</body>
</html>