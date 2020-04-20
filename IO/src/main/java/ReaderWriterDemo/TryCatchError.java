package ReaderWriterDemo;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchError {
    public static void main(String[] args) {
        FileWriter output=null;//增加变量的作用域
        try {
            output=new FileWriter("IO\\src\\main\\java\\ReaderWriterDemo\\c.txt");
            output.write("Str");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(output!=null)
                {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
