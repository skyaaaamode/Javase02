package com.cn.Response.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servletresponse01")
public class Servletresponse01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo01被访问了");
       //1.设置状态码
        response.setStatus(302);
        //重定向
        response.setHeader("location","/zzf/Servletresponse02");
        //简单的重定向方法
        response.sendRedirect("/zzf/Servletresponse02");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
