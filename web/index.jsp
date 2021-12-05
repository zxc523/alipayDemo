<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/11/29
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>付款</title>
  </head>
  <body>
  <form action="/payment" method="get">
    <input type="text" value="01" name="oid">
    <input type="text" value="23" name="num">
    <input type="text" value="450" name="total">
    <input type="text" value="学java的哪些年" name="cname">
    <input type="text" value="沉浮半生" name="author">
    <input type="submit" value="开始"/>
  </form>
  </body>
</html>
