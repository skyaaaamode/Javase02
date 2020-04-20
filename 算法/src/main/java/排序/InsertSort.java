package 排序;

import java.util.Arrays;

/**
 *插入排序
 */
public class InsertSort {
    public static void sort(int[] arr) {

        try {
            if (arr.length < 2) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("参数之错误");
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j-1, j);
                }
                continue;
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
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
        int size = 100;
        int value = 10;
        Boolean successed = true;
        for (int i = 0; i < time; i++) {
            int[] sample = InsertSort.geneRandomarray(size, value);
            int[] arr1 = InsertSort.copyArr(sample);
            int[] arr2 = InsertSort.copyArr(sample);
            InsertSort.sort(arr1);
            InsertSort.rightMethod(arr2);
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
