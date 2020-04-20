<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: 37587
  Date: 2019/12/3
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jsp入门--%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%
  //设置响应体的消息体的数据格式和编码不需要了
//  response.setContentType("text/html;charset=utf-8");
  //1.获取所有的cookie
  Cookie[] cookies = request.getCookies();
  boolean flag=false;
  //2.判断cookie数据，判断数组中是不是有Lasttime
  if(cookies!=null&&cookies.length!=0)
  {
    for (Cookie i:cookies)
    {
      if(i.getName().equals("LastTime"))
      {
        flag=true;
        //1.响应数据
        String value = i.getValue();
        //进行url解码
        System.out.println("解码前"+value);
        value= URLDecoder.decode(value,"utf-8");
        System.out.println("解码前"+value);
        response.getWriter().write("<h1>欢迎回来，您上一次访问的时间是:</h1>"+value);
        //2.写回cookie
        Date cur = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss");
        String format = simpleDateFormat.format(cur);
        //不支持空格等特殊字符，用url编码
        System.out.println("编码前"+format);
        format= URLEncoder.encode(format,"utf-8");
        System.out.println("编码后"+format);
        i.setValue(format);
        i.setMaxAge(60*60*24*30);//设置cookie的声明为空
        response.addCookie(i);
        break;

      }

    }

  }
  if(cookies==null||cookies.length==0||flag==false)
  {
    //1.增加lastTime选项
    Date cur = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    String format = simpleDateFormat.format(cur);
    format=URLEncoder.encode(format,"utf-8");
    Cookie cookie = new Cookie("LastTime",format);
    cookie.setMaxAge(60*60*30*24);
    response.addCookie(cookie);
    //2.响应数据
    out.write("<h1>欢迎访问</h1>");
  }
%>
  </body>
</html>
