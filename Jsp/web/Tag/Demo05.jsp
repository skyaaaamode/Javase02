<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.com.Demo.User" %><%--
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
    <title>foreach标签</title>
</head>
<body>
<%
    ArrayList<User> users = new ArrayList<>();
    users.add(new User("zzf01",12));
    users.add(new User("zzf02",13));
    users.add(new User("zzf03",14));
    users.add(new User("zzf04",15));
    request.setAttribute("list",users);

%>
<table border="1" width="500" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="user" varStatus="i">
        <c:if test="${i.count%2==0}">
            <tr>
                <td>${i.count}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </c:if>
        <c:if test="${i.count%2!=0}">
            <tr bgcolor="yellow">
                <td>${i.count}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </c:if>

    </c:forEach>
</table>
</body>
</html>
