import org.junit.Test;
import 排序.BucketSort;

import java.util.Arrays;

public class MyTest {
    @Test
    public  void test01() {
        System.out.println(1/2);
        System.out.println(1/3);
        System.out.println(2/3);
    }
    @Test
    public  void test02() {
        int[] ints = new int[2];
        for (int i :ints){
            System.out.println(i);
        }
        boolean[] ints1 = new boolean[2];
        for (boolean j :ints1){
            System.out.println(j);
        }
        double[] ints2 = new double[2];
        for (double j :ints2){
            System.out.println(j);
        }
    }
    @Test
    public  void test03() {
        int[] arr={19,9,6,4,2,2};
        Arrays.sort(arr);
        BucketSort.print(arr);
    }
    @Test
    public void test04(){
        System.out.println(Math.pow(2, 7)+Math.pow(2, 6)+Math.pow(2, 5)+Math.pow(2, 4)+Math.pow(2, 2));
    }

}
