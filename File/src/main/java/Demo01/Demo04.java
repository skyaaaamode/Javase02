package Demo01;

import java.io.File;

/**
 * list的遍历
 */
public class Demo04 {
    public static void main(String[] args) {
        File input=new File("D:\\Javase02\\File\\src\\main\\java\\Demo01");
        for (String name:input.list())//遍历的是目录，也能获取隐藏的文件夹，返回的是隐藏String
        {
            System.out.println(name);
        }
        for (File name:input.listFiles())
        {
            System.out.println(name);
        }

    }
}
