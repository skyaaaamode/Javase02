package 动态规划;

import java.util.Arrays;

/**
 * 有N堆石子排成一排，每堆石子有一定的数量。现要将N堆石子并成为一堆。合并的过程只能
 * 每次将相邻的两堆石子堆成一堆，每次合并花费的代价为这两堆石子的和，经过N-1次合并
 * 后成为一堆。求出总的代价最小值。
 */
public class HebinStone {
    public static void method(int[] arr){
       int max=Integer.MAX_VALUE;
        int n = arr.length;
        int[][] dp = new int[n+1][n+1];
        int[] sum=new int[n+1];
        sum[0]=0;
           //dp数组初始化
           for(int i=0;i<=n;i++) {
               Arrays.fill(dp[i], max);
           }
           for (int i=1;i<=n;i++){
                   sum[i]=arr[i-1]+sum[i-1];
                   dp[i][i]=0;
                   if(i<n)
                   {
                       dp[i][i+1]=arr[i-1]+arr[i];
                   }


           }
          for (int len=0;len<n;len++){
              for (int i=1;i+len<=n;i++){
                  int j=i+len;
                 for (int k=i;k<j;k++)
                 {
                     dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k+1][j]+sum[j]-sum[i-1]);
                 }
              }
          }

        System.out.println(dp[1][n]);
    }

    public static void main(String[] args) {
        HebinStone.method(new int[]{4,5,3,10,1});
    }


}
