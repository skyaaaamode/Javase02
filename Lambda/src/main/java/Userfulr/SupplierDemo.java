package Userfulr;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierDemo {
    public static String getString(Supplier<String> e)
    {
        return e.get();
    }
    //寻找数组中的最大值
    public static int getMax(Supplier<Integer> e)
    {
        return e.get();
    }
    public static void main(String[] args) {
        int[] arr={0,100,-50,88,9,333,54};
        System.out.println(getString(()->"huge"));
        System.out.println(getMax(()->
        {
            int max=0;
            for (int i:arr)
            {
                if(i>max)
                {
                    max=i;
                }
            }
            return max;

        }));

    }
}
