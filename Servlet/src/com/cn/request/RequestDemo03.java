package com.cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo03")
public class RequestDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String refer=request.getHeader("referer");
        System.out.println(refer);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String refer=request.getHeader("referer");
        System.out.println(refer);
        //防盗链
        if(refer!=null)
        {
            if (refer.contains("/ddd"))
            {
                System.out.println("正常");
            }
            else
            {
                System.out.println("hehe");
            }
        }
    }
}
