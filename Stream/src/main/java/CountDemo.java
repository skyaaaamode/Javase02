import java.util.ArrayList;
import java.util.List;

/**
 * count方法统计集合中的元素个数
 */
public class CountDemo {
    public static void main(String[] args) {
        List<Integer> m=new ArrayList<Integer>();
        m.add(1);
        m.add(1);
        m.add(1);
        m.add(1);
        m.add(1);
        System.out.println(m.stream().count());


    }
}
