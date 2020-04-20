package Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\Object\\f.txt"));
        Object o=ois.readObject();
        ois.close();
        System.out.println((person)o);
    }

}
