import lombok.Data;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkList<T> implements Iterable {
    private int size;
    private Node First;
    private Node Last;
    private int modsize;
    public MyLinkList(){
        doClear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
    @Data
    public static class Node<T> {
        private T data;
        private Node next;
        private Node pre;
        /**
         * 代表链表被变更的次数
         */
        public Node(T d,Node p,Node n){
            data=d;
            pre=p;
            next=n;

        }

    }
    public void clear(){
        doClear();
    }
    public void doClear(){
        Node pre=new Node<T>(null,null,null);
        Node next=new Node<T>(null,pre,null);
        size=0;
        pre.next=next;
        modsize++;

    }
    public void add(int index,T data){
        addBefore(getNode(index),data);
    }
    public void addBefore(Node p,T data) {
        Node<T> newNode = new Node<>(data, null, p);
        p.getPre().setNext(newNode);
        newNode.setNext(p.getNext());
        p.setPre(newNode);
        modsize++;
        size++;
    }

    public Node<T> remove(Node<T> p) {
        p.pre.next=p.next;
        p.next.pre=p.pre;
        size--;
        modsize++;
        return p;
    }
    public Node getNode(int index){
        return getNode(index,0,size-1);
    }
    public Node getNode(int index,int from,int to){
        if(index<from||index>to)
        {
            return null;
        }
        Node next=new Node();
        if(index<(from+to)/2){
            next = First.next;
            for (int i=0;i<index;i++)
            {
                next=next.next;
            }
        }
        else {
            next = Last.pre;
            for (int i=size-1;i>index;i--)
            {
                next=next.pre;
            }
        }
        return next;

    }
    public int size(){
        return size;
    }
    public void print(Node head){
        while (head!=null){
            System.out.println(head.getData());
            head=head.getNext();
        }
    }

    public static void main(String[] args) {

    }

}
