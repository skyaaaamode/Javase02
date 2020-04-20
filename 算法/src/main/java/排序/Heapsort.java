package 排序;

import java.util.Arrays;

public class Heapsort {
    /**
     * 完全二叉树，左孩子是2i+1，右孩子是2i+2
     * 父节点：i-1/2
     */
    public static void sort(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }
        for (int i=1;i<arr.length;i++){
            heapInsert(arr,i);
        }
        int heapsize=arr.length-1;
        while (heapsize>=0){
            swap(arr,0,heapsize);
            heapfy(arr,0,--heapsize);
        }

    }

    public static void heapInsert(int[] arr,int index){
        if(index<0) {
            return;
        }
        while (arr[index]>arr[(index-1)/2]){
          swap(arr,index,(index-1)/2);
          index=(index-1)/2;
        }
    }
    public static void heapfy(int[] arr,int index,int heapsize){
        int left=index*2+1;
       while(left<=heapsize){
           int lagest=(left+1)<=heapsize&&arr[left]<arr[left+1]?(left+1):left;
           lagest=arr[index]>=arr[lagest]?index:lagest;
           if(lagest==index){
               break;
           }
           swap(arr,index,lagest);
           index=lagest;
           left=index*2+1;
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
            Heapsort.sort(arr1);
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
//    public static void main(String[] args) {
//        int[] ints = {2,3,2,2,-4,-1,5};
//        Heapsort.sort(ints);
//    }
}
