<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/10/2023
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form action="/calculate" method="post">
    <table class="table" style="border: 4px solid">
      <thead>
      <tr style="height: 30px">
        <td scope="row"><label for="fo">First operand</label></td>
        <td><input type="text" id="fo" name="first-operand"></td>
      </tr>
      </thead>
      <tbody>
      <tr style="height: 30px">
        <td><label for="o">Operator</label></td>
        <td><select name="operator" id="o">
          <option value="+">Addition (+)</option>
          <option value="-">Subtraction (-)</option>
          <option value="*">Multiplication (*)</option>
          <option value="/">Division (/)</option>
        </select></td>
      </tr>
      <tr style="height: 30px">
        <td><label for="so">Second operand</label></td>
        <td><input type="text" id="so" name="second-operand"></td>
      </tr>
      </tbody>
    </table>
    <input style="margin-top: 10px" type="submit" value="Calculator">
  </form>
  </body>
</html>
