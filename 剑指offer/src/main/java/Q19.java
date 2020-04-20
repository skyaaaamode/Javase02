import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Q19 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i:input){
            integers.add(i);
        }
        for (int j=0;j<k;j++){
            result.add(integers.poll());
        }
        return result;

    }
}
