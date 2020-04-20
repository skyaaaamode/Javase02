/**
 * 统计集合中元素出现的个数
 */
package Collection;

import java.util.ArrayList;

public class Demo01 {
    public static int listCount(ArrayList<String> i,String x)
    {
        int count=0;
        for (String g:i)
        {
            if(g.equals(x))
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listCount(list, "a"));
        System.out.println("b:"+listCount(list, "b"));
        System.out.println("c:"+listCount(list, "c"));
        System.out.println("xxx:"+listCount(list, "xxx"));

    }
}
