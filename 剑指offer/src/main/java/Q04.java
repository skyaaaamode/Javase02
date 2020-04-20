/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class Q04 {
    public static TreeNode method(int [] pre,int [] in,int l1,int l2,int r1,int r2) {
        if(pre.length<0){
            return null;
        }
        if(l1==r1){
            return new TreeNode(pre[l1]);
        }
        TreeNode head = new TreeNode(pre[l1]);
        int index = getIndex(pre[l1], in);
        int i = index - l2;
        head.left=method(pre,in,l1+1,l2,l1+i,index-1);
        head.right=method(pre,in,l1+i+1,r1,l1+i,r2);
        return head;
    }
    public static int getIndex(int target,int[] b){
        for (int i=0;i<b.length;i++){
            if(b[i]==target){
                return i;
            }
        }
        return 0;
    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return method(pre,in,0,pre.length-1,0,pre.length-1);
    }

    public static void main(String[] args) {



    }
}
