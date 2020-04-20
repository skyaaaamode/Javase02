package Check;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

class Calculator
{
    @TestCheck
    public void add()
    {
        System.out.println(1+1);
    }
    @TestCheck
    public void odd()
    {
        System.out.println(1-1);
    }
    @TestCheck
    public void XX()
    {
        System.out.println( 1*1);
    }
    @TestCheck
    public void d()
    {
        System.out.println(1/0);
    }
}
public class Check {
    public static void main(String[] args) throws IOException {
        //创建一个Calculator对象
        Calculator x=new Calculator();
        //获取字节码文件对象
        Class y=Calculator.class;
        //获取所有方法
        Method[] m=y.getMethods();
        int num=0;//记录异常发生的次数
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Javase02\\注解\\src\\main\\java\\Check\\bug.txt"));
        for (Method i:m)
        {
            //判断判断方法上是否有TestCheck注解
            if(i.isAnnotationPresent(TestCheck.class))
            {
                //如果有注解，捕获异常
                try
                {
                    i.invoke(x);
                }
                catch(Exception e)
                {
                    //捕获异常并记录在文件中
                   num++;
                   bw.write(i.getName()+"的方法出现了异常");
                   bw.newLine();
                    bw.write("异常是"+e.getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常产生的原因是："+e.getCause().getMessage());
                    bw.newLine();

                }
            }
        }
        bw.write("一个出现出现了"+num+"个错误");
        bw.flush();
        bw.close();
    }

}
