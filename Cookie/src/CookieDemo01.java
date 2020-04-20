import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的快速入门
 */
@WebServlet("/CookieDemo01")
    public class CookieDemo01 extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1.创建cookie
            Cookie cookie01 = new Cookie("zzf", "hello");
            Cookie cookie02 = new Cookie("wz", "hello");


            //2.发送cookie
            response.addCookie(cookie01);
            response.addCookie(cookie02);

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
