package 链表;

import NodeStructure.LNode;
import Utils.GeneStructure;
import Utils.Print;

/**
 * k链表翻转。给出一个链表和一个数k，比如链表1→2→3→4→5→6，k=2，
 * 则翻转后2→1→4→3→6→5，若k=3,翻转后3→2→1→6→5→4，若k=4，翻转后4→3→2→1→5→6，用程序实现。
 */

public class ListReverse {
    public void method(LNode head, int k){

    }
    public static LNode reverse(LNode head)
    {
        LNode pre=head;
        LNode next=head.next;
        while (next!=null){
            LNode next1 = next.next;
            next.next=pre;
            pre=next;
            next=next1;
        }
        head.next=null;
        return pre;
    }

    public static void main(String[] args) {
        LNode lNode = GeneStructure.listGene(new int[]{1, 2, 3, 4, 5, 6});
        Print.printList(lNode);
        LNode reverse = ListReverse.reverse(lNode);
        Print.printList(reverse);
    }



}
