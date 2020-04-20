package Example;

import com.sun.source.tree.Scope;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        while (true)//让服务器一直处于监听状态
        {
            File wenjian=new File("D:\\Javase02\\Net\\src\\main\\java\\Example");
            Socket channel=ss.accept();
            if(!wenjian.exists())
            {
                wenjian.mkdir();
            }
            //文件名不修改的话所有的同名文件会被覆盖掉
            String name=wenjian+"\\"+System.currentTimeMillis()+"1.jpg";
//        FileOutputStream ops=new FileOutputStream(wenjian+"\\"+"1.jpg");
            FileOutputStream ops=new FileOutputStream(name);
/**
 * 怎么让服务器一直处于监听状态，让accept一直处于监听状态，添加死循环
 */
            OutputStream ops01=channel.getOutputStream();
            InputStream is=channel.getInputStream();
            int len=0;
            byte[] x=new byte[1024];
            while((len=is.read(x))!=-1)
            {
                ops.write(x,0,len);
            }
            ops01.write("已经收到文件，谢谢".getBytes());
            ops.close();
            channel.close();
        }
//        ss.close();

    }
}
