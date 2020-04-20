package Demo01;

import java.io.File;
import java.io.IOException;

/**
 * 文件的创建和删除
 */
public class Demo03 {
    public static void main(String[] args) {
        File s=new File("D:\\Javase02\\File\\src\\main\\java\\a.txt");
        File s02=new File("File\\src\\main\\java\\a.txt2.txt");

        try {
            System.out.println(s.createNewFile());//创建文件（非文件夹）
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(s02.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
//创建文件夹的方法mkdir，mkdirs
        File s03=new File("D:\\Javase02\\File\\src\\main\\java\\kkk");
        File s04=new File("D:\\Javase02\\File\\src\\main\\java\\11\\22\\33");
        s03.mkdir();//不会抛出异常，路径错误不会创建
        s04.mkdirs();
        //删除文件或文件夹 public boolean delete，文件删除成功返回true，文件有内容不删除返回false
        //路径不存在返回false，delete直接在硬盘中删除，不会走回收站
        s03.delete();
        s04.delete();
    }
}
