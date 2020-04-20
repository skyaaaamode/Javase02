/**
 * 统计字符串中字符的数目
 */

import jdk.dynalink.NoSuchDynamicMethodException;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void cout(String s)
    {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> x=new HashMap<>();
        for (char i:arr)
        {
            if(x.containsKey(i))
            {
                x.put(i,x.get(i)+1);
            }
            else
            {
                x.put(i,1);
            }
        }
        for (Map.Entry<Character,Integer> g:x.entrySet())
        {
            System.out.println(g.getKey()+" "+g.getValue());
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> x=new HashMap();
        x.put("zzf01","01");
        x.put("zzf02","02");
        x.put("zzf03","03");
        x.put("zzf04","04");
        System.out.println(x);
        System.out.println(x.remove("zzf05")+" "+x);
        System.out.println(x.get("zzf01"));
        System.out.println(x.containsKey("zzf01"));
        //map集合的遍历(第一种当hi)
        for (String i:x.keySet())
        {
            System.out.println(i+":"+x.get(i));
        }
        //也可以用集合特有的iterator方法遍历
        for(Map.Entry<String,String> i:x.entrySet())
        {
            System.out.print(i.getKey()+":"+i.getValue());
            System.out.print(" ");
        }
        
        cout("ahudaufeihhfie");
    }
}
