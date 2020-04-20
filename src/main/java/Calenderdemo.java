import java.util.Calendar;

/**
 * 日历类的实现
 */
public class Calenderdemo
{
    public static void main(String[] args) {
        //实例化的方法
        Calendar x=Calendar.getInstance();
        x.set(Calendar.YEAR,9999);
        x.add(Calendar.YEAR,-10);//增加指定字段的值
        System.out.println(x.get(Calendar.YEAR));


    }
}
