package 动态规划;

/**
 * 求子序列
 */
public class Zixulie {
    public static void method(char[] c,int i,String pre){
        if(i==c.length){
            if(!"".equals(pre)){
                System.out.println(pre);
            }
            return;
        }
        method(c,i+1,pre);
        method(c,i+1,pre+String.valueOf(c[i]));
    }

    public static void main(String[] args) {
        Zixulie.method("abc".toCharArray(),0,"");
    }
}
