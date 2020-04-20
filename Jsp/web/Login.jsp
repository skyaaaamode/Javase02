<%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/4
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logion</title>
    <style>
        .error
        {
            color: red;
        }
    </style>
</head>
<body>
<form action="/Jsp_war_exploded/loginServlet">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" id="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password"name="password" id="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkcode" id="checkcode"></td>
        </tr>
        <tr>
            <td colspan="2"><img src="/Jsp_war_exploded/checkCode" id="img"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
<div class="error"><%=request.getAttribute("cc_error")==null? "":request.getAttribute("cc_error")%></div>
<div class="error"><%=request.getAttribute("login_error")==null? "":request.getAttribute("login_error")%></div>
<script>
    window.onload=function () {
        var img = document.getElementById("img");
        img.onclick=function () {
            img.src="/Jsp_war_exploded/checkCode?time="+new Date().getTime();
        }
    }

</script>

</body>
</html>
