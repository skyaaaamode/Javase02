/**
 * 实现服务器端程序
 */
package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket x=new ServerSocket(8888);
        Socket y=x.accept();
        InputStream input=y.getInputStream();
        OutputStream out=y.getOutputStream();
        byte[] re=new byte[1024];
        int len=input.read(re);
        System.out.println(new String(re,0,len));
        out.write("已收到请求".getBytes());
        y.close();
        x.close();




    }
}
