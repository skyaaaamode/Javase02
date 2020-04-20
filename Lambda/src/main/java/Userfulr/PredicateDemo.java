package Userfulr;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static boolean checkTest(String s, Predicate<String> e)
    {
        return e.test(s);
    }
    public static boolean checkTest(String s, Predicate<String> e,Predicate<String> f)
    {
//        return e.test(s)&&f.test(s);
        return e.and(f).test(s);//or,negate非
    }

    public static void method(String[] arr,Predicate<String> p1,Predicate<String> p2)
    {
        ArrayList<String> result=new ArrayList<>();
        for (String i:arr)
        {
            if(p1.and(p2).test(i))
            {
                result.add(i);
            };
        }
    }

    public static void main(String[] args) {
        System.out.println(checkTest("zzf",(String name)-> name.length()<3));
        System.out.println(checkTest("azf",(String name)->
                name.length()<=3,(name)->name.contains("a")));
        String[] arr={"zhozuhuofan01",};

    }
}
