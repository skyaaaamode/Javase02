package 动态规划;

public class FinSum {
    public static boolean finsum(int[] arr,int i,int sum,int aim){
        if(i==arr.length){
            return sum==aim;
        }
        return finsum(arr,i+1,sum,aim)||finsum(arr,i+1,sum+arr[i],aim);
    }

    /**
     * 非递归版本
     * @param arr
     * @param aim
     * @return
     */
    public static boolean finsum(int[] arr,int aim) {
        boolean[][] dp = new boolean[arr.length + 1][aim + 1];
        for (int i=0;i<dp.length;i++){
            dp[i][aim]=true;
        }
        for (int x=arr.length-1;x>=0;x--){
            for (int y=aim-1;y>=0;y--){
                dp[x][y]=dp[x+1][y]||dp[x+1][y+arr[x]];
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,7};
        System.out.println(FinSum.finsum(arr,0,0,15));
    }
}
