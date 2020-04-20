public class Q13 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return ;
        }
        Mirror(root.right);
        Mirror(root.left);
        TreeNode left = root.left;
        root.left=root.right;
        root.right=left;
    }

    public static void main(String[] args) {

    }

}
