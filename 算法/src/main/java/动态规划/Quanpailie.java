package 动态规划;

import java.util.HashSet;

/**
 * 字符的全排列
 */
public class Quanpailie {
    public static void method(char[] arr,int i) {
       if (i==arr.length){
           System.out.println(String.valueOf(arr));
           return;
       }
        HashSet<Character> integers = new HashSet<Character>();
        for (int j=i;j<arr.length;j++){
            if(!integers.contains(arr[j])){
                swap(arr,i,j);
                method(arr,i+1);
                integers.add(arr[j]);
            }
       }
    }
    public static void swap(char[] arr,int i,int j){
        char tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        Quanpailie.method("acc".toCharArray(),0);
    }

}
