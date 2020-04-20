package question.sort;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 用大根堆获得最带利润
 */
public class Q04 {
    public class Node{
        public int index;
        public int cost;
        public int p;
        public Node(int index,int cost,int p){
            this.index=index;
            this.cost=cost;
            this.p=p;
        }
    }
    //小根堆
    public PriorityQueue<Node> cost;
    //大根堆c
    public PriorityQueue<Node> priofity;
    //成本利润列表
    public List<Node> ls;
    public Q04(int[] c,int[] p){
        cost=new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.cost<o2.cost){
                    return -1;
                }
                else if(o1.cost>o2.cost){
                    return 1;
                }
                return 0;
            }
        });
        priofity=new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.p>o2.p){
                    return -1;
                }
                else if(o1.p<o2.p){
                    return 1;
                }
                return 0;
            }
        });
        for (int i=0;i<c.length;i++){
            Node node = new Node(i,c[i], p[i]);
            cost.add(node);
        }
    }
    public int monery(int m){
        Node peek = cost.peek();
        if(peek.cost>m) {
            return 0;
        }
        while (cost.peek().cost<=m){
            Node poll = cost.poll();
            priofity.add(poll);
        }
        return priofity.peek().p;
    }
    public int solveResult(int m,int k){
        int result=0;
        if(k<0){
            return 0;
        }
        for (int i=0;i<k&&i<cost.size();i++){
            while(cost.peek().cost<=m&&!cost.isEmpty()){
                int monery = monery(m);
                result+=monery;
                m=monery;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
