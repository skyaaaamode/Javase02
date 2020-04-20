package question.sort;

import 排序.InsertSort;

import java.util.Arrays;

/**
 * 无序数组，求排序后相邻两数最大差值
 */
public class Q01 {
    public static int[] getMaxMin(int[] arr){
        if(arr.length>0&&arr.length<2){
            return new int[]{arr[0],arr[0]};
        }
        if(arr==null||arr.length==0){
            return new int[]{0,0};
        }
        int[] ints = new int[2];
        int max=arr[0];
        int min=arr[0];
        for (int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        ints[0]=max;
        ints[1]=min;
        return ints;
    }
    public static int partition(int[] arr){
        if(arr==null||arr.length<2)
        {
            return 0;
        }
        int[] maxMin = getMaxMin(arr);
        if(maxMin[1]==maxMin[0])
        {
            return 0;
        }
        int size=arr.length;
        boolean[] buckt=new boolean[size+1];
        int[] max=new int[size+1];
        int[] min=new int[size+1];
        for (int i:arr){
            int getindex = getindex(i,maxMin[1],maxMin[0],size+1);
            max[getindex]=buckt[getindex]?Math.max( max[getindex],i):i;
            min[getindex]=buckt[getindex]?Math.min( min[getindex],i):i;
            buckt[getindex]=true;
        }
        int result=0;
        for (int j=1;j<buckt.length;j++){
            if(!buckt[j]){
                continue;
            }
            int v=j-1;
            if(!buckt[v])
            {
                while(!buckt[v]){
                    v--;
                }
            }
            int value=min[j]-max[v];
            result=Math.max(value,result);
        }
        return result;
    }
    public static int getindex(int num,int min,int max,int bucktsize){
        if(num==max){
            return (num-min)*bucktsize/(max-min)-1;
        }
        return (num-min)*bucktsize/(max-min);
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int rightMethod(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        for (int i=0;i<arr.length-1;i++){
            max= Math.max((arr[i+1]-arr[i]),max);
        }
        return max;
    }

    public static int[] geneRandomarray(int size, int value) {
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) ((value) * Math.random());//随机数生成
        }
        return arr;
    }

    public static int[] copyArr(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int time = 50000;
        int size = 100;
        int value = 10;
        Boolean successed = true;
        for (int i = 0; i < time; i++) {
            int[] sample = InsertSort.geneRandomarray(size, value);
            int arr1 = Q01.partition(sample);
            int arr2 = Q01.rightMethod(sample);
            if (arr1!=arr2) {
                successed = false;
                print(sample);
                break;
            }
        }
        System.out.println(successed ? "nice" : "wrong");
    }
//    public static void main(String[] args) {
//        int[] test={-9,-7,-4,-4,-3,-3,-3,-2,-2,-1,-1,1,2,4,4,7,7,8};
//        int partition = Q01.partition(test);
//        System.out.println(partition);
//    }

}
