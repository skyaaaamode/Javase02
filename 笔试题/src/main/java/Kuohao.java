import java.util.Scanner;
import java.util.Stack;

public class Kuohao {
    public static boolean judge(String s){
        if(s==null||s.length()%2!=0){
            return false;
        }
        Stack<Character> charstack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char i:chars)
        {
            if (i=='('||i=='['||i=='{'){
                charstack.push(i);
            }
            if((charstack.peek()=='{'&&i=='}')||
                    (charstack.peek()=='['&&i==']')||
                    (charstack.peek()=='('&&i==')'))
            {
                charstack.pop();
            }
        }
        return charstack.isEmpty();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(Kuohao.judge(s));

        }
    }
}
