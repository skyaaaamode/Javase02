package structure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinTree {
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public List<Node> datas;
    public Node head;
    public BinTree(int[] arr){
        datas=new ArrayList<Node>();
        for (int i:arr){
            datas.add(new Node(i));
        }

        for(int i=0;i<arr.length/2;i++){
            datas.get(i).left=(i*2+1)<arr.length?datas.get(i*2+1):null;
            datas.get(i).right=(i*2+2)<arr.length?datas.get(i*2+2):null;
        }
        head=datas.get(0);
    }

    public void preorder(Node head){
        if(head!=null){
            System.out.print(head.data+" ");
            preorder(head.left);
            preorder(head.right);
        }
    }
    public void midorder(Node head){
        if(head!=null){
            midorder(head.left);
            System.out.print(head.data+" ");
            midorder(head.right);
        }
    }
    public void afterorder(Node head){
        if(head!=null){
            afterorder(head.left);
            afterorder(head.right);
            System.out.print(head.data+" ");
        }
    }

    public static void main(String[] args) {
        int[] test={1,2,3,4,5,6,7,8};
        BinTree binTree = new BinTree(test);
        binTree.preorder(binTree.head);
        System.out.println();
        binTree.midorder(binTree.head);
        System.out.println();
        binTree.afterorder(binTree.head);
        new LinkedList<>();

    }
}
