package Object;
/**
 * 进行序列化或者反序列换需要继承Seriablizable接口标记
 */

import java.io.*;

class person implements Serializable
{
    private String name;
    private int age;
    //手动生成序列号，防止修改类的定义后无法反序列化
    public static final long serialVersionUID=-1L;


    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\Object\\f.txt"));
        oos.writeObject(new person("zhouzhuofan",18));
        oos.close();
    }
}
