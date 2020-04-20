package Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\Buffered\\e.txt");
        BufferedOutputStream my=new BufferedOutputStream(fos);
        my.write("写入内存中".getBytes());
        my.flush();
        my.close();
    }
}
