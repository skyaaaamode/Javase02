package Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\Buffered\\e.txt");
        BufferedInputStream x=new BufferedInputStream(fis);
        int len=0;
        byte[] in=new byte[1024];
        while ((len=x.read(in))!=-1)
        {
            System.out.println(new String(in,0,len));
        }
        x.close();//只用关闭缓冲流

    }
}
