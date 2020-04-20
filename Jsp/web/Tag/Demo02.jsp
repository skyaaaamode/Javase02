<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/4
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
<%--c:choose 标签
完成数字对应星期几的代码
   1.域中存储一个数字
   2.使用choose标签取出数字
   3.使用when标签做数字判断
   4.otherwise标签做其他情况声明
--%>
<%
    request.setAttribute("week","3");
%>
<c:choose>
    <c:when test="${week==1}">星期1</c:when>
    <c:when test="${week==2}">星期2</c:when>
    <c:when test="${week==3}">星期3</c:when>
    <c:when test="${week==4}">星期4</c:when>
    <c:when test="${week==5}">星期5</c:when>
    <c:when test="${week==6}">星期6</c:when>
    <c:when test="${week==7}">星期7</c:when>

    <c:otherwise>数字输入有误</c:otherwise>
</c:choose>
</body>
</html>
