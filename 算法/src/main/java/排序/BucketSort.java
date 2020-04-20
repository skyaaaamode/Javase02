package 排序;

import java.util.Arrays;

/**
 * 桶排序
 */
public class BucketSort {

    public static int[] getMaxMin(int[] arr){
        if(arr.length>0&&arr.length<2){
            return new int[]{arr[0],arr[0]};
        }
        if(arr==null||arr.length==0){
            return new int[]{0,0};
        }
        int[] ints = new int[2];
        int max=arr[0];
        int min=arr[0];
        for (int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        ints[0]=max;
        ints[1]=min;
        return ints;
    }

    /**
     *计数排序
     * @param arr
     */
    public static void sort(int[] arr){
        int[] maxMin = getMaxMin(arr);
       int max=maxMin[0];
       int min=maxMin[1];
        int bucketsize=(max-min)+1;
        int[] bucket = new int[bucketsize];
        for (int i:arr){
            int index = indexgene(min, i);
            bucket[index]=bucket[index]+1;
        }
        int arrindex=0;
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]==0){
                continue;
            }
            int num = bucket[i];
            int indextovalue = indextovalue(min, i);
            while (num>0){
            arr[arrindex++]=indextovalue;
            num--;
        }
        }
    }
    public static int indexgene(int min,int num){
        return (num-min);
    }
    public static int indextovalue(int min,int index){
        return (min+index);
    }
    public static void print(int[] arr){
        for (Object i:arr){
            System.out.print(i+" ");
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
            BucketSort.sort(arr1);
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
