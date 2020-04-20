import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat
{
    public static void main(String[] args) throws ParseException {
        String s="yyyy-MM-dd HH-mm-ss";
        SimpleDateFormat simple=new SimpleDateFormat(s);
        Date x=new Date();
        System.out.println(simple.format(x));
        //parse
        System.out.println(simple.parse("2013-01-01 12-33-50"));
    }
}
