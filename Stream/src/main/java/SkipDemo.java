import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 跳过前几个元素的方法
 */
public class SkipDemo {
    public static void main(String[] args) {
        ArrayList<String> result=new ArrayList<>();
        result.add("张无忌");
        result.add("赵敏");
        result.add("周芷若");
        result.add("张三丰");
        result.add("张三");
        Stream<String> x=result.stream();
        x.skip(2).forEach(i-> System.out.println(i));

    }
}
