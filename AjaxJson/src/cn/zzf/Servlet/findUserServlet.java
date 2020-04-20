package cn.zzf.Servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/findUserServlet")
public class findUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        HashMap<String, Object> stringStringHashMap = new HashMap<>();
        if(username.equals("tom"))
        {
            stringStringHashMap.put("userExist",true);
            stringStringHashMap.put("msg","该用户名太受欢迎，请更换一个");
        }
        else
        {
            stringStringHashMap.put("userExist",false);
            stringStringHashMap.put("msg","该用户名可用");
        }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(stringStringHashMap));
        mapper.writeValue(response.getWriter(),stringStringHashMap);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
