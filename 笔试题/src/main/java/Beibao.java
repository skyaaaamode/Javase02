import java.util.Scanner;

public class Beibao {
    public static int method01(int[] p,int[] w,int bag,int i,int sum){
        if(sum>bag){
            return Integer.MIN_VALUE;
        }
        if(i==p.length){
            return 0;
        }
        return Math.max(method01(p,w,bag,i+1,sum),p[i]+method01(p,w,bag,i+1,sum+w[i]));
    }

    public static void method(int[] p,int[] w,int bag){
        if(p==null||p.length<1)
        {
            return;
        }
        int i = method01(p, w, bag, 0, 0);
        System.out.println(i);
    }
    public static int[] recert(String[] arr){
        int[] ints = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ints[i]=Integer.parseInt(arr[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int bag = Integer.parseInt(scanner.nextLine());
        String  s= scanner.nextLine();
        String[] w = s.split(" ");
        String  s2= scanner.nextLine();
        String[] p = s2.split(" ");
        int[] p1 = Beibao.recert(p);
        int[] w1 = Beibao.recert(w);
        Beibao.method(p1,w1,bag);
    }

}
