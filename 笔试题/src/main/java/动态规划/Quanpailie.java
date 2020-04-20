package 动态规划;

import java.util.HashSet;

/**
 * 输入一个字符串,要求输出字符串中字符所有的排列,例如输入"abc",
 * 得到"abc","acb","bca","bac","cab","cba"
 */
public class Quanpailie {
   public static void method(char[] s,int i){
       if(i==s.length){
           System.out.println(String.valueOf(s));
       }
       HashSet<Character> characters = new HashSet<>();
       for (int j=i;j<s.length;j++){
           if(characters.contains(s[j])){
               continue;
           }
           characters.add(s[j]);
           swap(s,i,j);
           method(s,i+1);
           swap(s,i,j);
       }
   }

    public static void swap(char[] arr, int i, int j){
        char tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        Quanpailie.method("abb".toCharArray(),0);
    }
}
