import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 对流进行截取，只取前几个元素
 */
public class LimitDemo {
    public static void main(String[] args) {
        ArrayList<String> result=new ArrayList<>();
        result.add("张无忌");
        result.add("赵敏");
        result.add("周芷若");
        result.add("张三丰");
        result.add("张三");
        Stream<String> x=result.stream();
        Stream<String> x2=x.limit(2);
        x2.forEach(i-> System.out.println(i));

    }
}
