/**
 * Date类的两个构造方法和成员方法
 */

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date x=new Date();
        Date y=new Date(124545455);
        System.out.println(x);
        System.out.println(y);
        System.out.println(System.currentTimeMillis());
        System.out.println(x.getTime());//日期转化成毫秒值
    }
}
