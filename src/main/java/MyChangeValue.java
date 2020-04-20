/**
 * 计算多个参数的相加(0-n)
 */
public class MyChangeValue {

    public static int addAll(int ... arr)
    {
        System.out.println(arr.length);
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println( addAll(1,2,3));
    }
}
