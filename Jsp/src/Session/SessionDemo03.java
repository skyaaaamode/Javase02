package Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/SessionDemo03")
public class SessionDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 期待客户端关闭,服务器不关闭,获取到sesion对象是同一个
         */
        HttpSession session = request.getSession();
        System.out.println(session);
        //1.设置cookie
        Cookie jessionId = new Cookie("JSESSIONID", session.getId());
        jessionId.setMaxAge(60*60);
        response.addCookie(jessionId);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
