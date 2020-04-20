package com.cn.request.案例;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        //2.获取请求参数
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

        Map<String, String[]> parameterMap = request.getParameterMap();
        User input=new User();
        try {
            BeanUtils.populate(input,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        //3.封装user对象
//        User input=new User();
//        input.setUsername(username);
//        input.setPassword(password);
        //4.调用userdao对象
        UserDao dao=new UserDao();
        User login = dao.login(input);
        //5.判断
        if(login==null)
        {
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }
        else
        {
            request.setAttribute("username",login.getUsername());
            request.getRequestDispatcher("/successedServlet").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  this.doPost(request,response);
    }
}
