import java.util.Date;

/**
 * System的常用方法
 * currentTimeMillis()获取当前系统毫秒值
 */
public class MySystem {
    //计算for循环9999次花费的时间
    public static void method()
    {
        System.out.println(System.currentTimeMillis());
        long from=System.currentTimeMillis();
        int sum=0;
        for (int i=1;i<10000;i++)
        {
//            sum=sum+i;
            System.out.println(i);
        }
        long to=System.currentTimeMillis();
        System.out.println("花费的时间为："+(to-from)+"毫秒");

    }
    public static void method02()
    {
        int[] a=new int[]{1,2,3,4,5,6};
        int[] b=new int[]{1,2,3,4,5,6};
        System.arraycopy(a,2,b,4,2);
        System.out.println(b.toString());
    }

    public static void main(String[] args) {
        method();
        method02();
    }

}
