import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InoutStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader io=new InputStreamReader(new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\c.txt"),"GBk");
        int len=0;
        while((len=io.read())!=-1)
        {
            System.out.println((char)len);
        }

    }
}
