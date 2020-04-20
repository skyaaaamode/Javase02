package 查找;

public class BinSearch {
    public static void method(int[] arr,int target,int i,int j){
        if(i>j){
            return;
        }
        if(i==j){
            if(arr[j]==target){
                System.out.println(j);
            }
            else {
                System.out.println(-1);
            }
        }
        int mid=(i+j)/2;
        if(arr[mid]==target){
            System.out.println(mid);

        }
        else if(arr[mid]>target){
            method(arr,target,i,mid-1);
        }
        else{
            method(arr,target,mid+1,j);
        }
    }

    public static void main(String[] args) {
        int[] test = {1, 4, 5, 7, 8, 9, 12};

        BinSearch.method(test,10,0,6);
    }

}
