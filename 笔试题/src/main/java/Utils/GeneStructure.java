package Utils;

import NodeStructure.LNode;

public class GeneStructure {
    public static LNode listGene(int[] data){
        LNode head=null;
        if(data==null||data.length<1){
            return head;
        }
        head=new LNode(data[0]);
        LNode p=head;
        for (int i=1;i<data.length;i++){
            p.next=new LNode(data[i]);
            p=p.next;
        }
        return head;
    }
}
