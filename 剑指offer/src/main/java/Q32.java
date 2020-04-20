import java.util.ArrayList;

public class Q32 {

    public static ArrayList<int[]> list;
    public static void gene(int[] arr,int i){
        if(i==arr.length){
            list.add(arr);
            return;
        }
        for (int m=i+1;m<arr.length;m++){
            swap(arr,i,m);
            gene(arr,i+1);
            swap(arr,i,m);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
