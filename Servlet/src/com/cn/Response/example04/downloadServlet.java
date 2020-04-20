package com.cn.Response.example04;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class downloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.获取请求参数
        String filename = req.getParameter("filename");
        //2.加载字节输入流进内存
        //2.1找到文件真实路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        //2.2用字节流关联
        FileInputStream fileInputStream = new FileInputStream(realPath);

        //3.设置response的响应头
        //3.1设置响应头的类型
        String mimeType = servletContext.getMimeType(filename);
        resp.setContentType(mimeType);
        System.out.println(mimeType);
        //3.2 设置响应头的打开方式
        resp.setHeader("content-disposition","attachment;filename="+filename);
//2.3将输入流的数据写出到输出流中,注意这个顺序不能调换
        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len=0;
        while ((len=fileInputStream.read(bytes))!=-1) {
            outputStream.write(bytes,0,len);
        }
        fileInputStream.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req,resp);
    }
}
