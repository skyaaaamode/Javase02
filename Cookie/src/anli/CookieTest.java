package anli;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应体的消息体的数据格式和编码
        response.setContentType("text/html;charset=utf-8");
        //1.获取所有的cookie
        Cookie[] cookies = request.getCookies();
        boolean flag=false;
        //2.判断cookie数据，判断数组中是不是有Lasttime
        if(cookies!=null&&cookies.length!=0)
        {
            for (Cookie i:cookies)
            {
                if(i.getName().equals("LastTime"))
                {
                    flag=true;
                    //1.响应数据
                    String value = i.getValue();
                    //进行url解码
                    System.out.println("解码前"+value);
                    value= URLDecoder.decode(value,"utf-8");
                    System.out.println("解码前"+value);
                    response.getWriter().write("<h1>欢迎回来，您上一次访问的时间是:</h1>"+value);
                    //2.写回cookie
                    Date cur = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss");
                    String format = simpleDateFormat.format(cur);
                    //不支持空格等特殊字符，用url编码
                    System.out.println("编码前"+format);
                    format=URLEncoder.encode(format,"utf-8");
                    System.out.println("编码后"+format);
                    i.setValue(format);
                    i.setMaxAge(60*60*24*30);//设置cookie的声明为空
                    response.addCookie(i);
                    break;

                }

            }

        }
       if(cookies==null||cookies.length==0||flag==false)
       {
           //1.增加lastTime选项
           Date cur = new Date();
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
           String format = simpleDateFormat.format(cur);
           format=URLEncoder.encode(format,"utf-8");
           Cookie cookie = new Cookie("LastTime",format);
           cookie.setMaxAge(60*60*30*24);
           response.addCookie(cookie);
           //2.响应数据
           response.getWriter().write("<h1>欢迎访问</h1>");
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
