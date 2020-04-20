/**
 * 实现客户端程序
 */
package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCOIPDemo {
    public static void main(String[] args) throws IOException {
        Socket f=new Socket("127.0.0.1",8888);
        OutputStream ops=f.getOutputStream();
        ops.write("Hellow 你好".getBytes());
        InputStream is=f.getInputStream();
        int len=0;
        byte[] os=new byte[1024];
        while((len=is.read(os))!=-1)
        {
            System.out.println(new String(os,0,len));
        }
        f.close();


    }
}
