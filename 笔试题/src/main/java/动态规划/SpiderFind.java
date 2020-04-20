package 动态规划;

import java.util.ArrayList;

/**
 * 百度Spider如何在不超过抓取限额的情况下使得抓取的网页价值之和最大，要求一个最佳抓取方案。
 * 请详细描述你的算法思路（可以用伪代码），并分析时间复杂度和空间复杂度。
 */
public class SpiderFind {
    public static ArrayList<Integer> cache=new ArrayList<Integer>();
    public static int  find01(int[] value,int[] weight,int big)
    {
        int i = find(0, 0, value, weight, big);
        return i;
    }
    public static int  find(int i,int sumweight,int[] value,int[] weight,int big)
    {
        if(sumweight>big){
            return Integer.MIN_VALUE;
        }
        if(i==value.length){
           return 0;
        }
       return Math.max(find(i+1,sumweight,value,weight,big),value[i]+find(i+1,sumweight+weight[i],value,weight,big));
    }
    public static int[][]  find02(int[] value,int[] weight,int big)
    {
        int x=value.length+1;
        int y=big+1;
        int[][] ints = new int[x][y];
        for (int i=x-2;i>=0;i--){
            for (int j=y-1;j>=0;j--){
                ints[i][j]=ints[i+1][j];
                if(j+weight[i]<y){
                    ints[i][j]=Math.max(ints[i][j],ints[i+1][j+weight[i]]+value[i]);
                }
            }
        }
        return ints;
    }
//    public static  void  getPath(int i,int j,int[] value,int[] weight,int big){
//        int[][] ints = find02(value, weight, big);
//        while (i+1<ints.length&&)
//        if(ints[i+1][j]<ints[i+1][j+weight[i]]+value[i]){
//
//        }
//
//
//    }

    public static void main(String[] args) {
        int[] c = { 3, 2, 4, 7 };
        int[] p = { 5, 6, 3, 19 };
        int bag = 11;
        System.out.println(SpiderFind.find02(p, c, bag));
        System.out.println(SpiderFind.find01(p, c, bag));
        System.out.println(SpiderFind.cache);
    }

}
