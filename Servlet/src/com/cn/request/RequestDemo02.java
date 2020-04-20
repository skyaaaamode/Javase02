package com.cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo02")
public class RequestDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //获取所有的请求头名称
        Enumeration<String> x=request.getHeaderNames();
        while (x.hasMoreElements())
        {
            System.out.println(request.getHeader(x.nextElement()));
        }
    }
}
