import java.util.ArrayList;
import java.util.Scanner;

public class Meituan03 {
    public static int time=0;
    public static void method01(int num, int[] num1){
        time=0;
        ArrayList<Integer> help = new ArrayList<>();
        method(num,num1,0,help);
        System.out.println(time%998244353);
    }

    public static void method(int num, int[] num1, int i, ArrayList<Integer> help){
      if(i==num){
          return;
      }
      if(num1[i]%(help.size()+1)!=0){
          method(num,num1,i+1,help);
          help.remove(help.size()-1);
          return;
      }
      else {
          time++;
          help.add(num1[i]);
          method(num,num1,i+1,help);
      }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] num1 = scanner.nextLine().split(" ");
        int[] ints = new int[num1.length];
        for (int i=0;i<ints.length;i++){
            ints[i]=Integer.parseInt(num1[i]);
        }
        Meituan03.method01(num,ints);

    }
}
