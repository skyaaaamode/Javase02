import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 文件字节输入流
 */
public class FileInputstream {


    public static void main(String[] args) throws IOException {
//        FileInputStream fis=new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt");
//        int len=0;
//        while ((len=fis.read())!=-1)//一次读取一个字节
//        {
//            System.out.println((char)fis.read());
//        }
//        fis.close();
        //一次读取多个字节的方法
        byte[] result=new byte[2];
        FileInputStream fis02=new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt");
        int x=fis02.read(result);//依次读取多个字节，int代表读取的有效字节的个数
        System.out.println(x);
//        System.out.println(Arrays.toString(result));
        System.out.println(new String(result));//可以用String的构造法方法
        fis02.close();

        //循环优化效果
        byte[] result01=new byte[1024];//1kb
        FileInputStream fis03=new FileInputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt");
       int len=0;
        while((len=fis03.read(result01))!=-1)
        {
            System.out.println(new String(result01));
        }
        fis03.close();

    }
}
