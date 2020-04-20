package question.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 流数据要抛出中位数
 */
// TODO: 2020/3/7  
public class Q02 {
   public static PriorityQueue<Integer> big;
   public static PriorityQueue<Integer> small;
   public Q02(){
       big=new PriorityQueue<Integer>();
       small=new PriorityQueue<Integer>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               if(o1<o2){
                   return -1;
               }
               else if(o2<o1){
                   return 1;
               }
               else {
                   return 0;
               }
           }
       });
   }
   public static void add(int x){
       if(big.isEmpty()){
           big.add(x);
           return;
       }
       if(big.peek()>x){
           big.add(x);
       }
       else {
           small.add(x);
       }
       swap();

   }
    public static void swap(){
        int b = big.size();
        int s = small.size();
        if(Math.abs(b-s)<2){
            return;
        }
        if(b>s){
            small.add(big.poll());
        }
        if(b<s){
            big.add(small.poll());
        }
    }
    public static double getMid(){
       int result;
       if(small.size()>big.size()){
           return small.peek();
       }
       else if(small.size()<big.size()){
           return big.peek();
       }
       else {
           return (big.peek()+small.peek())/2.0;
       }
    }


}
