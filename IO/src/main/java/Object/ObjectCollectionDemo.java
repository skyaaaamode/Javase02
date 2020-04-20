/**
 * 对集合进行序列化和反序列化
 */
package Object;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectCollectionDemo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<person> con=new ArrayList<person>();
        Collections.addAll(con,new person("zhouzhuofan",18),new person("zhouzhuofan",19),
                new person("zhouzhuofan",20));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\Object\\g.txt"));
        oos.writeObject(con);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\Object\\g.txt"));
        for(person i:(ArrayList<person>)ois.readObject())
        {
            System.out.println(i);
        }
    }

}
