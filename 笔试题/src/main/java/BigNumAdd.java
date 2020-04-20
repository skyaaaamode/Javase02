import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigNumAdd {
    public static String add(String num1,String num2){
        Stack<Character> addNum = new Stack<Character>();
        addNum.push('0');
        if(BigNumAdd.isEmpty(num1)&&BigNumAdd.isEmpty(num2)){
            return "0";
        }
        if(BigNumAdd.isEmpty(num1)||BigNumAdd.isEmpty(num2)){
            return BigNumAdd.isEmpty(num1)?num2:num1;
        }
        Stack stacknum1 = stringtostack(num1);
        Stack stacknum2 = stringtostack(num2);
        /**
         * 判断符号
         */
        char sign01 = (char)stacknum1.pop();
        char sign02 = (char)stacknum2.pop();
        while (!stacknum1.isEmpty()&&!stacknum2.isEmpty()){
            int i = Integer.parseInt(String.valueOf(stacknum1.pop()));
            int j = Integer.parseInt(String.valueOf(stacknum2.pop()));
            int k = Integer.parseInt(String.valueOf(addNum.pop()));
            int value=i+j+k;
            int current=value%10;
            int up=value/10;
            addNum.push((char)(current+48));
            addNum.push((char)(up+48));
        }
        while (!stacknum1.isEmpty()){
            int i = Integer.parseInt(String.valueOf(stacknum1.pop()));
            int k = Integer.parseInt(String.valueOf(addNum.pop()));
            int value=i+k;
            int current=value%10;
            int up=value/10;
            addNum.push((char)(current+48));
            addNum.push((char)(up+48));
        }
        while (!stacknum2.isEmpty()){
            int i = Integer.parseInt(String.valueOf(stacknum2.pop()));
            int k = Integer.parseInt(String.valueOf(addNum.pop()));
            int value=i+k;
            int current=value%10;
            int up=value/10;
            addNum.push((char)(current+48));
            addNum.push((char)(up+48));
        }
        StringBuffer stringBuffer = new StringBuffer();
        addNum.pop();
        while (!addNum.isEmpty())
        {
            stringBuffer.append(addNum.pop());
        }
        return "\""+stringBuffer.toString()+"\"";


    }
    public static Stack stringtostack(String num1){
        if(num1.charAt(0)>='0'&&num1.charAt(0)<='9')
        {
            num1="+"+num1;

        }
        char[] chars = num1.toCharArray();
        Stack<Character> objects = new Stack<Character>();
        for (char i:chars){
            objects.push(i);
        }
        return objects;
    }
    public static boolean isEmpty(String num){
        if(num==null||"".equals(num)){
            return true;
        }
        return false;
    }
    public static String getNum(String num){
        String regEx="-?[0-9]+(.[0-9]+)?";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(num);
        return ( m.replaceAll("").trim());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1=BigNumAdd.getNum(scanner.nextLine());
        String num2=BigNumAdd.getNum(scanner.nextLine());
        String result=BigNumAdd.add(num1,num2);
        System.out.println(result);
    }
}
