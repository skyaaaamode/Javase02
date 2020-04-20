/**
 * 打印流
 */
package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ji");
        PrintStream pm=new PrintStream("D:\\Javase02\\IO\\src\\main\\java\\PrintStream\\h.txt");
        pm.write(97);
        pm.println(97);
        //修改打印语句的目的地
        System.out.println("我是在控制台输出");
        System.setOut(pm);
        System.out.println("我是在文件中输出");
        pm.close();
    }
}
