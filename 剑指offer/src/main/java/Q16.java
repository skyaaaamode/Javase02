import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Q16 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty())
        {
            TreeNode pop = treeNodes.poll();

            list.add(pop.val);
            if(pop.left!=null){
                treeNodes.add(pop.right);
            }
            if(pop.right!=null){
                treeNodes.add(pop.left);
            }
        }
        return list;

    }
}
