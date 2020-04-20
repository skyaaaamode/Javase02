package cn.zzf.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo04 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       //对request消息进行增强
        System.out.println("输出FilterDemo04");
        chain.doFilter(req, resp);
        //对response消息进行增强
        System.out.println("kakaka");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
