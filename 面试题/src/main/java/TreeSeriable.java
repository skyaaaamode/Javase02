/**
 * 树的序列化与反序列化
 */
public class TreeSeriable {
    public static int index=-1;
    public static String serriable(BinTree.Node head){
        StringBuilder  result=new StringBuilder();
        if(head==null){
            result.append("#,");
            return result.toString();
        }
            result.append(head.data+",");
            result.append(serriable(head.left));
            result.append(serriable(head.right));
            return result.toString();
    }
    public static BinTree.Node deserriable(String msg){
        index++;
        if(msg==null||msg.isEmpty()){
            return null;
        }
        String[] split = msg.split(",");
        if(split[index].equals("#")){
            return null;
        }
        BinTree.Node root = new BinTree.Node(Integer.parseInt(split[index]));
        root.left=deserriable(msg);
        root.right=deserriable(msg);
        return root;
    }

    public static void main(String[] args) {
        int[] test={1,2,3,4,5,6,7,8};
        BinTree binTree = new BinTree(test);
        String serriable = TreeSeriable.serriable(binTree.head);
        System.out.println(serriable);
        BinTree.Node deserriable = TreeSeriable.deserriable(serriable);
        binTree.preorder(deserriable);
    }

}
