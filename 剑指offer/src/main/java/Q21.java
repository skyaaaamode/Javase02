//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.Queue;
//
///***
// * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
// * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习
// * 惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
// */
//public class Q21 {
//    public int GetUglyNumber_Solution(int index) {
//        Queue<Integer> q2 = new LinkedList<>();
//        Queue<Integer> q3 = new LinkedList<>();
//        Queue<Integer> q5 = new LinkedList<>();
//       if(index<1){
//           return 1;
//       }
//        ArrayList<Integer> list = new ArrayList<>();
//       list.add(1);
//        int value=1;
//        int i=0;
//        while (i<index){
//            Integer cur = list.get(0);
//            q2.add(cur*2);
//            q3.add(cur*3);
//            q5.add(cur*5);
//            Collections.(new int[]{q2.peek(),q5.peek(),q3.peek()});
//
//        }
//    }
//    public int finMin()
//}
