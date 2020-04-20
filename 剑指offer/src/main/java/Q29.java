import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s01 = scanner.nextLine();
        String s02 = scanner.nextLine();
        int num1=Integer.parseInt(s01.substring(1,s01.length()));
        int num2=Integer.parseInt(s02.substring(1,s02.length()));
        System.out.println("\""+(num1+num2)+"\"");
    }
}
