package anli;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //1.设置request的编码格式
        request.setCharacterEncoding("utf-8");
        //2.获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkcode = request.getParameter("checkcode");
        //3.先判断验证码是否正确
        //先获取session中的验证码
        String checkcode_session = (String)request.getSession().getAttribute("checkcode_session");
        request.getSession().removeAttribute("checkcode_session");
        if(checkcode_session!=null&&checkcode_session.equalsIgnoreCase(checkcode))//忽略大小写比较字符串
        {
            //验证码正确，比较用户名和密码是否正确
            if("张三".equals(username)&&"123".equals(password))
            {
                //将信息存储在session中
                request.getSession().setAttribute("username",username);
                response.sendRedirect(request.getContextPath()+"/success.jsp");


            }
            else
            {
                //登录失败
                request.setAttribute("login_error","用户名或者密码错误");
                request.getRequestDispatcher("Login.jsp").forward(request,response);
            }


        }
        else
        {
            //1.验证码不一致
            //存储提示信息到request
            request.setAttribute("cc_error","验证码错误");
            //转发到登陆界面
            request.getRequestDispatcher("Login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
