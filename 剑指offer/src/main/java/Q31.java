import java.util.Stack;

/**
 * 给出一个布尔表达式的字符串，比如：true or false and false，
 * 表达式只包含true，false，and和or，现在要对这个表达式进行布尔求值，
 * 计算结果为真时输出true、为假时输出false，不合法的表达时输出error（比如：true true）。表达式求值是注意and 的优先级比 or
 * 要高，比如：true or false and false，等价于 true or (false and false)，计算结果是 true。
 */
public class Q31 {
    public static String method(String[] arr){
        if(arr==null||arr.length<1){
            return "error";
        }
        Stack<String> help = new Stack<>();

        for (int i=0;i<arr.length;i++){
            if("and".equals(arr[i])||"or".equals(arr[i])){
                if("and".equals(help.peek())||"or".equals(help.peek())||help.isEmpty()){
                    return "error";
                }
            }
            else {
                if(help.isEmpty()){
                    help.push(arr[i]);
                }
                else {
                    String sign=help.pop();
                    if("and".equals(sign)){
                        boolean and = f1(Boolean.valueOf(help.pop()), Boolean.valueOf(arr[i]), "and");
                        help.push(String.valueOf(and));
                    }
                    else {
                        help.push(sign);
                        help.push(arr[i]);
                    }
                }

            }
        }
        while (help.size()!=1){
            boolean b = f1(Boolean.valueOf(help.pop()), Boolean.valueOf(help.pop()), help.pop());
            help.push(String.valueOf(b));
        }
        return help.peek();
    }
    public static boolean f1(boolean one,boolean two,String s){
        if("and".equals(s)){
            return one||two;
        }
        else {
            return one&&two;
        }
    }

    public static void main(String[] args) {
        String method = Q31.method(new String[]{"and"});
        System.out.println(method);
        String method01 = Q31.method(new String[]{"true","and","false"});
        System.out.println(method01);
        String method02 = Q31.method(new String[]{"true","or","false"});
        System.out.println(method02);
    }
}
