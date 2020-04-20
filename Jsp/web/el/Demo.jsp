<%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/4
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的数据</title>
</head>
<body>
<%
    request.setAttribute("name","张三");
    session.setAttribute("age","32");
%>
<h3>el获取值</h3>
${requestScope.name}
${sessionScope.age}
</body>
</html>
