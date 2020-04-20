package Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try
        {
            FileReader x=new FileReader("D:\\Javase02\\IO\\src\\main\\java\\Buffered\\e.txt");
            BufferedReader y=new BufferedReader(x);
            String line=null;
            while ((line=y.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
