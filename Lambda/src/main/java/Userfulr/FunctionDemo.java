package Userfulr;

import java.util.function.Function;

public class FunctionDemo {
    public static void change(String s, Function<String,Integer> a)
    {
        int i=a.apply(s);
        System.out.println(i);

    }

    public static void main(String[] args) {
        change("123",(String i)->Integer.parseInt(i));
    }
}
