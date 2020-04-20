package 排序;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr,int L,int R){
        if(arr==null||arr.length<2){
            return;
        }
        if (L==R){
            return;
        }
        int mid=L+(R-L)/2;
        sort(arr,L,mid);
        sort(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr,int L,int mid,int R){
        int[] result=new int[R-L+1];
        int left=L;
        int right=mid+1;
        int index=0;
        while (index<arr.length&left<=mid&&right<=R){
            if(arr[left]<arr[right]){
                result[index]=arr[left];
                left++;
            }
            else{
                result[index]=arr[right];
                right++;
            }
            index++;
        }
        while (left<=mid){
            result[index++]=arr[left++];
        }
        while (right<=R){
            result[index++]=arr[right++];
        }
        for (int gg=0;gg<result.length;gg++){
            arr[L+gg]=result[gg];
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rightMethod(int[] arr) {
        Arrays.sort(arr);

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

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null && arr2 != null) {
            return false;
        }
        if (arr1 != null && arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int time = 50000;
        int size = 20;
        int value = 5;
        Boolean successed = true;
        for (int i = 0; i < time; i++) {
            int[] sample = MergeSort.geneRandomarray(size, value);
            int[] arr1 = MergeSort.copyArr(sample);
            int[] arr2 = MergeSort.copyArr(sample);
            MergeSort.sort(arr1,0,arr1.length-1);
            MergeSort.rightMethod(arr2);
            if (!isEqual(arr1, arr2)) {
                successed = false;
                print(sample);
                System.out.println();
                print(arr1);
                System.out.println();
                print(arr2);
                break;
            }
        }
        System.out.println(successed ? "nice" : "wrong");

    }
}
