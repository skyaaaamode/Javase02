package 递归;

public class Getmin {
    public static int getmin(int[] arr, int L, int R) {
        if (arr == null || arr.length == 0) {
            System.out.println("错误了");
        }
        if (L >= R) {
            return (arr[L]);
        }
        int mid = (R - L) / 2;
        int left = getmin(arr, L, mid);
        int right = getmin(arr, mid, R);
        return left < right ? left : right;

    }

    /**
     * 求n的阶乘
     *
     * @param n
     * @return
     */
    public static int N(int n) {
        if (n == 1) {
            return n;
        }
        return n * N(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Getmin.N(4));
    }
}
