package Example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSserver {
    public static void main(String[] args) throws IOException {
        ServerSocket s=new ServerSocket(8080);
        Socket ss=s.accept();
        InputStream is=ss.getInputStream();
//        int len=0;
//        byte[] r=new byte[1024];
//        while ((len=is.read(r))!=-1)
//        {
//            System.out.println(new String(r,0,len));
//        }
        BufferedReader input=new BufferedReader(new InputStreamReader(is));
        String line=input.readLine();
        String[] line_1=line.split(" ");
        String path=line_1[1].substring(2);
        //读取这个文件
        FileInputStream fis=new FileInputStream(path);
        int len=0;
        byte[] arr=new byte[1024];
        OutputStream ops=ss.getOutputStream();
        //固定写法
        ops.write("HTTP/1.1 200 OK\r\n".getBytes());
        ops.write("Content-Type:text/html\r\n".getBytes());
        ops.write("\r\n".getBytes());
        while((len=fis.read(arr))!=-1)
        {
            ops.write(arr,0,len);
        }
        fis.close();
        ss.close();
        s.close();





    }
}
