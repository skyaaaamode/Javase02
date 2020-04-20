package 递归;

import java.util.HashMap;

/**
 * 一个棋盘，向左向右走，找最小路径值
 */
public class Route {
    public int findMin(int[][] matrix,int x,int y ){
        int high = matrix.length;
        int weith = matrix[0].length;
        if(x==weith-1&&y==high-1){
            return matrix[x][y];
        }
        if(x==weith-1){
            return matrix[x][y]+findMin(matrix, x, y+1);
        }
        if(y==high-1){
            return matrix[x][y]+findMin(matrix, x+1, y);
        }
        int right = matrix[x][y] + findMin(matrix, x + 1, y);
        int left = matrix[x][y] + findMin(matrix, x , y+1);
        return Math.min(right,left);
    }

    /**
     * 添加缓存的版本
     * @param matrix
     * @param x
     * @param y
     * @return
     */
    public static HashMap cache=new HashMap<String,Integer>();
    public int findMin02(int[][] matrix,int x,int y ){
        int result=0;
        int high = matrix.length;
        int weith = matrix[0].length;
        if(x==weith-1&&y==high-1){
            result=matrix[x][y];
        }
        if(x==weith-1){
            String key=String.valueOf(x)+"_"+String.valueOf(y+1);
            if(cache.containsKey(key)){
                result=matrix[x][y]+(Integer) cache.get(key);
            }
            else {
                result= matrix[x][y]+findMin(matrix, x, y+1);
            }
        }
        if(y==high-1){
            String key=String.valueOf(x+1)+"_"+String.valueOf(y);
            if(cache.containsKey(key)){
                result=matrix[x][y]+(Integer) cache.get(key);
            }
            else {
                result= matrix[x][y]+findMin(matrix, x+1, y);
            }
        }
        int right = matrix[x][y] + findMin(matrix, x + 1, y);
        int left = matrix[x][y] + findMin(matrix, x , y+1);
        result=Math.min(right,left);
        String key= String.valueOf(x)+"_"+String.valueOf(y);
        cache.put(key,result);
        return result;
    }
}
