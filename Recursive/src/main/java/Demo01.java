import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用递归计算1-1000的和
 */
public class Demo01 {
    public int sum(int num)
    {
        if(num==1)//递归的结束条件
        {
            return 1;
        }
        return num+sum(num-1);//递归的目的
    }
    public int Jsum(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*Jsum(num-1);

    }
    //递归遍历目录
    public void printFile(File name)
    {
        if(name.exists())
        {
            System.out.println(name);
            for (File i:name.listFiles())
            {
                if(i.isDirectory())
                {
                    printFile(i);
                }
                else
                {
                    System.out.println(i);
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new Demo01().sum(100));
        System.out.println(new Demo01().Jsum(5));
        new Demo01().printFile(new File("D:\\Javase02\\File\\src\\main\\java\\Demo01"));
    }
}
