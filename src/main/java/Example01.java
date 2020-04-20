import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算一个人活了多少天
 */
public class Example01
{
    public static void main(String[] args) throws ParseException {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式“YYYY-MM-DD HH:mm:ss”");
        SimpleDateFormat x=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        long birth=x.parse(input.nextLine()).getTime();
        long y=new Date().getTime();
        long c=y-birth;
        System.out.println(c/60/60/24/1000);//只能通过这种方法转化？
    }
}
