package 排序;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr,int L,int R){
        if(L<R){
            swap(arr,L+(int)((R-L+1)*Math.random()),R);
            int[] partition = partition(arr, L, R);
            sort(arr,L,partition[0]-1);
            sort(arr,partition[1]+1,R);
        }

    }
    public static int[] partition(int[] arr,int L,int R){
        int less=L-1;
        int more=R;
        while (L<more){
            if(arr[L]<arr[R]){
                swap(arr,++less,L++);
            }
            else if(arr[L]>arr[R]) {
                swap(arr,--more,L);
            }
            else {
                L++;
            }
        }
        swap(arr,more,R);
        return new int[]{less+1,more};

    }
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
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
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 问题：怎么实现快排的稳定性?论文级别
     * @param args
     */


    public static void main(String[] args) {
        int time = 50000;
        int size = 20;
        int value = 5;
        Boolean successed = true;
        for (int i = 0; i < time; i++) {
            int[] sample = MergeSort.geneRandomarray(size, value);
            int[] arr1 = QuickSort.copyArr(sample);
            int[] arr2 = QuickSort.copyArr(sample);
            QuickSort.sort(arr1,0,arr1.length-1);
            QuickSort.rightMethod(arr2);
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
