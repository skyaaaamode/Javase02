/**
 * 一个持久的属性集
 */
package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //使用prperties集合存储数据，遍历取出数据
        show();
    }
    public static void show() throws IOException {
        Properties my=new Properties();
        my.setProperty("zzf01","175");
        my.setProperty("zzf02","174");
        my.setProperty("zzf03","173");
        //不能用put方法，因为可以使用别的类型，容易混淆
        for (String i:my.stringPropertyNames())
        {
            System.out.println(i+":"+my.getProperty(i));
        }
        //把集合中的临时数据写入到硬盘中
        FileWriter out= null;
        try{
            out = new FileWriter("D:\\Javase02\\IO\\src\\main\\java\\Properties\\d.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        my.store(out,"save data");
        //load方法，把硬盘中的见键值对文件读取到集合中来
        Properties xx=new Properties();
        xx.load(new FileReader("D:\\Javase02\\IO\\src\\main\\java\\Properties\\d.txt"));
        for (String gg:xx.stringPropertyNames())
        {
            System.out.println(gg+":"+xx.getProperty(gg));
        }
    }

}
