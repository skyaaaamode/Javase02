import java.util.ArrayList;
import java.util.Scanner;

/**
 * 判断字符串有多少回文子串
 */
public class Judgehuiwen {
    public static boolean isH(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        ArrayList<String> strings = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                strings.add(s.substring(i,j));
            }
        }
        int result=0;
        for (String i:strings){
            result=Judgehuiwen.isH(i)?(result+1):result;
        }
        System.out.println(result);

    }
}
