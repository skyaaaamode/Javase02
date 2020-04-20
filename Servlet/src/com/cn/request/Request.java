package com.cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取请求行的方法代码
 */
@WebServlet( "/Request")
public class Request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求方式
        String method=request.getMethod();
        //获取虚拟目录
     String contextPath=request.getContextPath();
     //获取servlet目录
     String servletPath=request.getServletPath();
     //获取get方式请求参数
     String queryString=request.getQueryString();
//     获取请求URI
     String requestURI=request.getRequestURI();
//     获取URL
     StringBuffer requestURL=request.getRequestURL();
//     获取协议及版本
     String protocol=request.getProtocol();
        String IP=request.getRemoteAddr();
     System.out.println("method:"+method);
     System.out.println("contextPath:"+contextPath);
        System.out.println("servletPath:"+servletPath);
        System.out.println("queryString:"+queryString);
        System.out.println("requestURI:"+requestURI);
        System.out.println("requestURL:"+requestURL);
        System.out.println("protocol:"+protocol);
        System.out.println("IP:"+IP);

    }
}
