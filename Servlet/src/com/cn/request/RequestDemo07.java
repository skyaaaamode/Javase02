package com.cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet( "/RequestDemo07")
public class RequestDemo07 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        System.out.println(request.getMethod()+":username-"+username);
        String[] hobbies = request.getParameterValues("hobby");
        for (String i:hobbies)
        {
            System.out.println(i);
        }
        //获取所有请求参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements())
        {
            String name = parameterNames.nextElement();
            System.out.println(name);
            String VALUE = request.getParameter(name);
            System.out.println(VALUE);
            System.out.println("-----------");
        }
        //获取所有参数的map集合
        Map<String, String[]> parameterMapDemo = request.getParameterMap();
        Set<String> keySet = parameterMapDemo.keySet();
        for (String i:keySet)
        {
            String[] values = parameterMapDemo.get(i);
            System.out.println(i);
            for (String x:values)
            {
                System.out.println(x);
            }
            System.out.println("---------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        System.out.println("get:"+username);
        this.doPost(request,response);
    }


}
