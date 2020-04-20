package 排序;

import java.util.Arrays;
import java.util.Map;

public class BubbleSort {
    public static void sort(int[] arr){
        //参数判别
        if(arr==null||arr.length<2){
            return;
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }

    }
    public static void swap(int[] arr,int i,int j){
        if(i<0||i>=arr.length||j<0||j>arr.length){
            return;
        }
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void rightMethod(int[] arr){
        Arrays.sort(arr);

    }
    public static int[] geneRandomarray(int size,int value){
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)((value+1)* Math.random())-(int)((value)* Math.random());//随机数生成
        }
        return arr;
    }
    public static int[] copyArr(int[] arr){
        int[] newarr = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public static boolean isEqual(int[] arr1,int[] arr2){
        if (arr1==null&&arr2==null){
            return true;
        }
        if(arr1==null&&arr2!=null){
            return false;
        }
        if(arr1!=null&&arr2==null){
            return false;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int time=50000;
        int size=100;
        int value=10;
        Boolean successed=true;
        for (int i=0;i<time;i++){
            int[] sample = BubbleSort.geneRandomarray(size, value);
            int[] arr1=copyArr(sample);
            int[] arr2=copyArr(sample);
            BubbleSort.sort(arr1);
            BubbleSort.rightMethod(arr2);
            if(!isEqual(arr1,arr2)){
                successed=false;
                print(sample);
                System.out.println();
                print(arr1);
                System.out.println();
                print(arr2);
                break;
            }
        }
        System.out.println(successed?"nice":"wrong");
//        int[] ints = {7,3,3,-7,0,-5};
//        int[] ints1 = BubbleSort.copyArr(ints);
//        int[] ints2 = BubbleSort.copyArr(ints);
//        BubbleSort.print(ints1);
    }
}
