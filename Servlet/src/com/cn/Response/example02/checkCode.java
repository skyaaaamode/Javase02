package com.cn.Response.example02;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 验证码程序
 */
@WebServlet("/checkCode")
public class checkCode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建一个对象，在内存中代表一个图片
        int height=300;
        int width=500;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        //2.美化图片
        //2.1填充背景色
        Graphics g = img.getGraphics();//获取画笔对象
        g.setColor(Color.pink);//设置画笔颜色
        g.fillRect(0,0,width,height);
        //2.2画边框
        g.setColor(Color.white);
        g.drawRect(0,0,width-1,height-1);
        //2.3写验证码
        String str="QWERTYUIOPASDFGHJKLZXCVBNMzxcvbnmasdfghjklpoiuytrewq";
        //生成随机角标
        Random rm=new Random();
        int i=0;
        while (i<4)
        {

            int index=rm.nextInt(str.length());
            char x=str.charAt(index);
            g.drawString(x+"",20+i*20,25);
            i++;
        }
        //2.4画干扰线
        g.setColor(Color.blue);
        //随机生成坐标点
        for (int z=0;z<10;z++)
        {
            int x1 = rm.nextInt(width);
            int y1 = rm.nextInt(height);
            int x2 = rm.nextInt(width);
            int y2 = rm.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }

        //3.将图片输出到浏览器客户端上
        ImageIO.write(img,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
