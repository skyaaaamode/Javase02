package com.cn.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie")
public class Cookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取cookie
        javax.servlet.http.Cookie[] cookies = request.getCookies();
        if (cookies!=null)
        {
            for (javax.servlet.http.Cookie i:cookies)
            {
                String name = i.getName();
                String value = i.getValue();
                System.out.println(name+","+value);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
