public class Sort {
    public static void method(int[] arr){
        if(arr.length<1){
            return;
        }
        int less=-1;
        int more=arr.length;
        int begin=0;
        while (begin<more){
            if(arr[begin]%2==1){
                begin++;
                less++;
            }
            else {
                swap(arr,begin,--more);
            }
        }
    }
    public static void swap(int[] arr,int L,int R){
        int tmp=arr[L];
        arr[L]=arr[R];
        arr[R]=tmp;
    }

    public static void main(String[] args) {
        int[] ints = {1, 9, 9, 6, 4, 2, 2};
        Sort.method(ints);
        System.out.println();

    }
}
