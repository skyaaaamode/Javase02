//import java.util.Scanner;
//
///**
// * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
// * 每一列都按照从上到下递增的顺序排序请完成一个函数，输入这样的一个二维数组和一个
// * 整数，判断数组中是否含有该整数。
// */
//public class Q0 {
//    public boolean Find(int target, int [][] array) {
//        if(array==null){
//            return false;
//        }
//        return find(target,array,0,array[0].length-1);
//
//    }
//    public boolean find(int target, int [][] array,int i,int j){
//        if(i>array.length||j<0){
//            return false;
//        }
//        if(target==array[i][j])
//        {
//            return true;
//        }
//        else if(target>array[i][j]){
//            return find(target,array,i+1,j);
//        }
//        else {
//            return find(target,array,i+1,j-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Integer s = Integer.parseInt(scanner.nextLine());
//        int[][] ints = new int[][];
//        for (int i=0;i<s;i++){
//
//        }
//
//    }
//
//}
