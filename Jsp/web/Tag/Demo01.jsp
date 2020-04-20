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
    <title>Title</title>
</head>
<body>
<%--c:if 标签
   1）属性
         test是必须属性，接收boolean 表达式
              如果为true，则显示标签体内容，false，则不显示标签体内容
              一般情况下，test属性值会结合el表达式一起使用--%>
<c:if test="${3==3}">
    <h1>我是真...</h1>
</c:if>
<%
    List objects = new ArrayList<>();
    objects.add("aaa");
    request.setAttribute("list",objects);
%>
<c:if test="${!empty list}">
    遍历集合
</c:if>
</body>
</html>
