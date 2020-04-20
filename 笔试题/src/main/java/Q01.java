import java.util.Scanner;

public class Q01 {
    public static void method(String num,String[] change){
        if(num==null||num.length()<1){
            System.out.println(num);
        }
        char[] chars = num.toCharArray();
        StringBuffer result = new StringBuffer();
        for (char i:chars){
            if(i=='1'){
                result.append(change[0]);
            }
            else if(i=='2'){
                result.append(change[1]);
            }
            else if(i=='3'){
                result.append(change[2]);
            }
           else if(i=='4'){
                result.append(change[3]);
            }
            else if(i=='5'){
                result.append(change[4]);
            }
            else if(i=='6'){
                result.append(change[5]);
            }
            else if(i=='7'){
                result.append(change[6]);
            }
            else if(i=='8'){
                result.append(change[7]);
            }
            else if(i=='9'){
                result.append(change[8]);
            }
            else {
                result.append(i);
            }

        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] num1 = scanner.nextLine().split(" ");
        Q01.method(num,num1);


    }

}
