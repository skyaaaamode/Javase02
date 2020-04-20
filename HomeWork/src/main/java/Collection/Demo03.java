package Collection;

import java.util.ArrayList;

/**
 * 集合中Contains方法的使用
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println(list.contains("a"));
    }
}
