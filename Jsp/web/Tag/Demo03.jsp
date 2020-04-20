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
    <title>foreach标签</title>
</head>
<body>
<%--c:foreach 标签
1.完成重复的操作
 for(int i=0;i<j;i++)
 {
 }
 属性：begin:开始值
       end结束值
       var：临时变量
       step：步长
       varStatus:循环状态对象
             index：容器中元素的索引
             count:循环次数

2.遍历容器
 List<User> list;
 for(User i:list)
 {
 }
   items:容器对象
   var：容器中临时变量
3.
--%>
<c:forEach begin="1" end="10" var="i" step="2">
    ${i}<br>
</c:forEach>
<%
    ArrayList<Object> objects = new ArrayList<>();
    objects.add("aaa");
    objects.add("bbb");
    objects.add("ccc");
    objects.add("aa");
    request.setAttribute("list",objects);
%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.count} ${s.index} ${str}
</c:forEach>
</body>
</html>
