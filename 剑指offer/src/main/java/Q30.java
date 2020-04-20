//import java.util.ArrayList;
//
//public class Q30 {
//    public static ArrayList<String> result=new ArrayList<String>();
//
//    public static ArrayList<String> geneZ(char[] s,int i){
//        if(i==0){
//            String s1=String.valueOf(s[0]);
//            result.add(sb);
//            return result;
//        }
//        ArrayList<String> stringBuffers = geneZ(s, i - 1);
//        for (StringBuffer item:stringBuffers){
//            String s1 = item.toString();
//            result.add(s1+String.valueOf(s[i]));
//        }
//        result.add(new StringBuffer(String.valueOf(s[0])));
//        return result;
//    }
//    public static boolean judge(String s){
//        int begin=0;
//        int end=s.length()-1;
//       while (begin<end){
//           if(s.charAt(begin++)!=s.charAt(end--)){
//               return false;
//           }
//       }
//       return true;
//    }
//
//    public static void main(String[] args) {
//        Q30.geneZ("abcde".toCharArray(),4);
//        System.out.println();
//    }
//}
