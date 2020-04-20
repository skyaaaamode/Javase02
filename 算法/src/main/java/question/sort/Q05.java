package question.sort;

/**
 * 对于一个足够大的整型数组arr，提供一个方法，计算出最大的N个，请用java代码完成
 */
public class Q05 {
    public void quicksort(int[] arr,int L,int R){

        if(L>=R){
            return;
        }
        swap(arr,L+(int)((R-L+1)*Math.random()),R);
        int[] minmax=partition(arr,L,R);
        quicksort(arr,L,minmax[0]-1);
        quicksort(arr,minmax[0]+1,R);
    }
    public int[] partition(int[] arr,int L,int R){
        int low=L-1;
        int big=R;
        int value=arr[R];
        int begin=L;
        while (L<big)
        {
            if(arr[L]>value){
                swap(arr,++low,L++);
            }
            else if(arr[L]<value){
                swap(arr,--big,L);
            }
            else {
                L++;
            }
        }
        swap(arr,R,big);
        return new int[]{low,big};
    }
    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public int[] method(int[] arr,int k){
        if(k>arr.length)
        {
            return arr;
        }
        quicksort(arr,0,arr.length-1);
        int[] ints = new int[k];
        for (int i=0;i<k;i++){
            ints[i]=arr[i];
        }
        return ints;
    }

}
