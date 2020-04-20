package Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(FileWriter w = new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\Buffered\\f.txt");
            BufferedWriter z=new BufferedWriter(w);){
            for (int i=0;i<10;i++)
            {
                z.write("I am ironman");
                z.newLine();//输出换行符号

            }
            z.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
