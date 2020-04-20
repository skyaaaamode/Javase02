import java.util.Scanner;

public class Wanmei {
    public static void method(int[][] solve){


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        int[][] solve = new int[l][2];
        for (int i=0;i<l;i++){
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            solve[i][0]=Integer.parseInt(s1[0]);
            solve[i][1]=Integer.parseInt(s1[1]);
        }
        Wanmei.method(solve);
    }
}
