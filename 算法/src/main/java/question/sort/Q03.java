package question.sort;

import java.util.PriorityQueue;

/**
 * 分金条实现哈夫曼编码
 */
// TODO: 2020/3/7
public class Q03 {
    public PriorityQueue<Integer> p;
    public Q03(){
        p=new PriorityQueue<Integer>();
    }
    public int huff(int[] arr){
        if(arr==null||arr.length<1){
            return 0;
        }
        if(arr.length<2){
            return arr[0];
        }
        for (int i:arr){
            p.add(i);
        }
        while (p.size()>1){
            int i= p.poll();
            int j=p.poll();
            int add=i+j;
            p.add(add);
        }
        return p.poll();
    }
}
