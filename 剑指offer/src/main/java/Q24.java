//import java.util.ArrayList;
//import java.util.Queue;
//import java.util.Stack;
//
///**
// * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
// */
//public class Q24 {
//    ArrayList<TreeNode> list=new ArrayList<>();
//    ArrayList<ArrayList<TreeNode>> alllist=new ArrayList<>();
//    public int TreeDepth(TreeNode root) {
//        Stack<TreeNode> q = new Stack<>();
//        q.add(root);
//        while (!q.isEmpty()){
//            TreeNode poll = q.pop();
//            list.add(poll);
//            TreeNode left = poll.left;
//            TreeNode right = poll.right;
//            if(left!=null){
//                q.push(left);
//            }
//            if(right!=null){
//                q.push(right);
//            }
//            if(left==null&&right==null){
//                alllist.add(list);
//                list.remove(list.size()-1);
//            }
//        }
//
//    }
//}
