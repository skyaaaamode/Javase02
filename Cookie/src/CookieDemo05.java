import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookie的存活时间
 */
@WebServlet("/CookieDemo05")
    public class CookieDemo05 extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1.创建cookie
            Cookie cookie01 = new Cookie("zzf", "hello");
//            //2.设置cookie的存活时间
            cookie01.setMaxAge(30);
            cookie01.setPath("/");
            //3.发送cookie
            response.addCookie(cookie01);

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
