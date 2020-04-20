package lambda;

import java.security.spec.RSAOtherPrimeInfo;

interface cooker
{
    //定义无参数无返回值的方法
    public abstract void cook();
}
public class Example01 {
    public static void main(String[] args) {
        invoke(new cooker() {
            @Override
            public void cook() {
                System.out.println("做饭啦");
            }
        });
        invoke(()-> System.out.println("做饭了"));

    }
    public static void invoke(cooker cook)
    {
        cook.cook();
    }
}
