import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStream {
    public static void main(String[] args) throws IOException {
        //将内存中的数据写入到硬盘中
        FileOutputStream fos=new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt");
        fos.write(Integer.parseInt("99"));
        fos.close();
        //一次传多个字节的方法
        FileOutputStream fos01=new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt");
        fos01.write(new byte[]{89,90,100});
        fos01.write(new byte[]{89,90,100},0,2);
        //将字符串写入数组
        byte[] x="你好".getBytes();
        fos01.write(x);
        fos01.close();
        //文件后面追加写数据
        //构造方法后面增加追加写开关
        FileOutputStream fos02=new FileOutputStream("D:\\Javase02\\IO\\src\\main\\java\\a.txt",true);
        byte[] x02="你好".getBytes();
        fos02.write(x02);
        fos02.write(x02);
        //换行符号怎么写
        for (int i=0;i<100;i++)
        {
            fos02.write(x02);
            fos02.write("\r\n".getBytes());
        }

    }
}
