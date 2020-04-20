<%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/4
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@page import="cn.com.Demo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的对象</title>
</head>
<body>
<%
    User user = new User();
    user.setUsername("zzf");
    user.setAge(13);
    request.setAttribute("u",user);
%>
<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
<h3>el获取对象</h3>
${requestScope.u.name}
</body>
</html>
