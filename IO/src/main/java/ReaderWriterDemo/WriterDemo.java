/**
 * writer是字符输出流最顶层的类
 */
package ReaderWriterDemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter out=new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\ReaderWriterDemo\\c.txt");
        out.write(96);
        out.flush();//必须刷新才能把字符写入到文件中
        out.write(97);
        out.close();
        //写入字符串
        FileWriter out02=new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\ReaderWriterDemo\\c.txt");
        char[] cs={'a','b','c','d'};
        out02.write(cs);
        out02.flush();
        out02.close();
        //字符流的续写和换行
        FileWriter out03=new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\ReaderWriterDemo\\c.txt",true);
        out03.write("zzf");
        out03.write("\r\n");
        out03.close();


    }
}
