/**
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */
public class Q22 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int l1=0;
        int l2=0;
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        while (p1.next!=null){
            l1++;
            p1=p1.next;
        }
        while (p2.next!=null){
            l2++;
            p2=p2.next;
        }
        if(l1>l2){
            p2=pHead2;
            for (int i=0;i<l2-l1;i++){
                p1=p1.next;
            }
        }
        else {
            p1=pHead1;
            for (int i=0;i<l2-l1;i++){
                p2=p2.next;
            }
        }

        while (p1.val!=p2.val){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;




    }
}
