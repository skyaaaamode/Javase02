package Utils;


import NodeStructure.LNode;

public class Print {
    public static void printList(LNode head){
        LNode head1 = head;
        while (head1!=null){
            System.out.print(head1.data+"---->");
            head1=head1.next;
        }
        System.out.println("null");

    }
    public static void printset(int[] x){
       for (int i:x){
           System.out.print(i+" ");
       }

    }
}
