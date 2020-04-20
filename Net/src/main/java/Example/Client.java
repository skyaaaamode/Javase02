package Example;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket c=new Socket("127.0.0.1",8888);
        InputStream is=new FileInputStream("D:\\Javase02\\Net\\src\\main\\java\\Example\\2.jpg");
        OutputStream os=c.getOutputStream();
        int len=0;
        byte[] r=new byte[1024];
        while ((len=is.read(r))!=-1)
        {
            os.write(r,0,len);
        }
        c.shutdownOutput();
        InputStream is02=c.getInputStream();
        int len02=0;
        byte[] r02=new byte[1024];
        while ((len02=is02.read(r02))!=-1)
        {
            System.out.println(new String(r02,0,len02));
        }
        is.close();
        c.close();

    }
}
