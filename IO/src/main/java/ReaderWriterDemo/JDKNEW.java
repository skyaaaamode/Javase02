package ReaderWriterDemo;

import java.io.FileWriter;
import java.io.IOException;

public class JDKNEW {
    public static void main(String[] args)  {

        try( FileWriter output=new FileWriter("IO\\src\\main\\java\\ReaderWriterDemo\\c.txt");
        ) {//JDK7的新特性
            output.write("Str");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
