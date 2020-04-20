import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的复制，图片，音频等都可以使用
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        long t1=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("IO\\src\\main\\java\\a.txt");
        FileOutputStream fos=new FileOutputStream("IO\\src\\main\\java\\b.txt");
        int len=0;
        byte[] input=new byte[1024];
        while((len=fis.read(input))!=-1)
        {
            System.out.println(new String(input));
            fos.write(input,0,len);//读取的是有效的字节数量，重要
        }
        fos.close();//先关闭写的任务
        fis.close();
        long t2=System.currentTimeMillis();
        System.out.println("复制完成，耗时"+(t2-t1));

    }
}
