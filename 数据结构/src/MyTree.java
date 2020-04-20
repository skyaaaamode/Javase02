import lombok.Data;

import java.util.ArrayList;

public class MyTree<T> {
    private  TNode root;
    private ArrayList<T> Tdata;
    private int size;
    @Data
    public static class TNode<T>{
       private T data;
       private TNode left;
       private TNode right;
       private TNode parent;
       public TNode(T d,TNode p){
           data=d;
           parent=p;
       }

    }
    /**
     * 普通树的创建
     */

    /**
     * 排序二叉树的创建
     */
}
