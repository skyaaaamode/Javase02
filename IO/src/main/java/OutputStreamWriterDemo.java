import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\c.txt"), "GBk");
        out.write("看好");
        out.flush();
        out.close();
    }
}
