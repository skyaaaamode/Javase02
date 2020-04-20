package com.cn.Response.example02;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servletresponse05")
public class Servletresponse05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取字节输出流
        ServletOutputStream sos = response.getOutputStream();
        //2.输出数据
        sos.write("hello".getBytes("utf-8"));
        //怎么解决中文乱码

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
