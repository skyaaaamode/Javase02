package Demo04;

public class Demo04 {
    public static int[] builder(int n,ArrayBuilder p)
    {
        return p.builderArray(n);
    }

    public static void main(String[] args) {
        int[] arr1=builder(3,(n)->
        {
            return new int[n];
        });
        System.out.println(arr1.length);
        int[] arr2=builder(3,int[]::new);
        System.out.println(arr2.length);
    }

}
