/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Q02 {
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        char[] chars = s.toCharArray();
        StringBuffer ss = new StringBuffer();
        for (char i:chars){
            if (i!=' ')
            {
                ss.append(i);
            }
           else {
               ss.append("%20");
            }
        }
        return ss.toString();
    }

    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("we are");
        String method = Q02.replaceSpace(s);
        System.out.println(method);
    }

}
