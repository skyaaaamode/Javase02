import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
 class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
           this.val = val;
        }
    }
public class Q03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> integers = new Stack<>();
        ListNode p=listNode;
        while (p!=null){
            integers.push(p.val);
            p=p.next;
        }
        while (!integers.isEmpty()){
            list.add(integers.pop());
        }
        return list;


    }
}
