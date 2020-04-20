package Collection;

import java.util.ArrayList;

/**
 * 把int类型的数组转换成集合,数组转集合
 */
public class Demo02
{
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        ArrayList<Integer> result=new ArrayList<>();
        for (int i:x)
        {
            result.add(i);
        }
        Object[] x_1=result.toArray();
    }
}