import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所
 * 有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 */
public class Q18 {
    public static ArrayList<String> result=new  ArrayList<String>();
    public static ArrayList<String> Permutation(String str) {
        result.clear();
        if(str==null||"".equals(str))
        {
            return result;
        }
        method(str.toCharArray(),0);
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return result;

    }

    public static void method(char[] arr,int i){
        HashSet set=new HashSet();
        if(i==arr.length){
            result.add(new String(arr));
            return;
        }
        for (int k=i;k<arr.length;k++){
            if(!set.contains(arr[k]))
            {
                set.add(arr[k]);
                swap(arr,i,k);
                method(arr,i+1);
                swap(arr,i,k);
            }

        }

    }
    public static void swap(char[] arr,int i,int j){
        char c = arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }

    public static void main(String[] args) {
        Q18.Permutation("abcc");
        System.out.println();
    }
}
