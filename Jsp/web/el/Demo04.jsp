<%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/4
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@page import="cn.com.Demo.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的对象</title>
</head>
<body>
<%
    List strings = new ArrayList<>();
    strings.add("aaa");
    strings.add("bbb");
    User user = new User();
    user.setUsername("zzf");
    user.setAge(13);
    strings.add(user);
    request.setAttribute("List",strings);
%>
<h3>el获取List对象</h3>
${requestScope.List}
${requestScope.List[0]}
${requestScope.List[2].username}


</body>
</html>
