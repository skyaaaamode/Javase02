package com.cn.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo")
public class Demo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
 * 通过request对象获取
 *    Request.servletContext()
 *    通过httpServlet获取
 *   This.getServletContext()
 */
        ServletContext servletContext1 = request.getServletContext();
        this.getServletContext();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
