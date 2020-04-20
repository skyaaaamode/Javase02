/**
 * 读取中文出现乱码用字节流,所以转用字符流
 */
package ReaderWriterDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader input=new FileReader(new File("D:\\Javase02\\IO\\src\\main\\java\\a.txt"));
        int len=0;
        while((len=input.read())!=-1)
        {
            System.out.println((char)len);
        }
        char[] x=new char[1024];
        len=0;
        while((len=input.read(x))!=-1)
        {
            System.out.println(new String(x,0,len));
        }
        input.close();
        //一次读取多个字符


    }
}
