import Utils.Print;

import java.util.ArrayList;

/**
 * 假设你能重返过去，现在让你回到2015年，你能选择一支股票进行投资，你拥有这支股票未来n天的价格走势图，为了躲避证监会的监控，
 * 你只有一次买入卖出机会。现在要求实现一个程序计算哪天买入哪天卖出能获得最大收益。
 */
public class Fuzhu {
    public static ArrayList<int[]> geneleft(int[] arr){
        int[] ints = new int[arr.length];
        int[] buy = new int[arr.length];
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
                buy[i]=i;
            }
            else {
                buy[i]=buy[i-1];
            }
            ints[i]=min;
        }
        ArrayList<int[]> ints1 = new ArrayList<>();
        ints1.add(ints);
        ints1.add(buy);
        return ints1;

    }

    public static int[] method(int[] arr){
        if(arr==null||arr.length<2){
            return new int[]{-1,-1};
        }
        ArrayList<int[]> geneleft = geneleft(arr);
        int[] ints = geneleft.get(0);
        int[] buy = geneleft.get(1);
        int[] result = new int[2];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if((arr[i]-ints[i])>max){
                max=(arr[i]-ints[i]);
                result[0]=buy[i];
                result[1]=i;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] method = Fuzhu.method(new int[]{2, 1, 4, 5, 3});
        Print.printset(method);
    }

}
