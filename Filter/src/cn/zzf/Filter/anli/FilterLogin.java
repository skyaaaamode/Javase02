package cn.zzf.Filter.anli;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class FilterLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        //2.获取资源的请求路径
        String requestURI = request.getRequestURI();
        //3.判断是否是登陆相关的资源路径
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
