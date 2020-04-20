import java.util.Scanner;

public class Meituan02 {
    public static void method(int num,String[] num1){
        if(num1.length<0){
            System.out.println(0);
        }
        int i=num1.length-1;
        double result=0;
        while (i-1>=0){
            result=result+f(Integer.parseInt(num1[i]))-f(Integer.parseInt(num1[i-1]));
            i=i-2;
        }
        if(i==0){
            result=result+f(Integer.parseInt(num1[0]));
        }
        System.out.println(String.format("%.5f",result));


    }
    public static double f(int i){
        return Math.PI*i*i;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] num1 = scanner.nextLine().split(" ");
        Meituan02.method(num,num1);

    }


}
