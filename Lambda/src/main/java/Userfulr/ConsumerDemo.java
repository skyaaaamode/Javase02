package Userfulr;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void method(String name,Consumer<String> con)
    {
        con.accept(name);
    }

    /**
     * consumer接口的默认方法andthen，连接两个consumer接口，一起消费
     *
     */
    public static void method(String name,Consumer<String> m1,Consumer<String> m2)
    {
//        m1.accept(name);
//        m2.accept(name);
        m1.andThen(m2).accept(name);//先执行前后执行后
    }

    /**
     * 格式化打印信息，按照
     *
     */
public static void method(String[] mes,Consumer<String> con1,Consumer<String> con2)
{
    for (String me : mes) {
        con1.andThen(con2).accept(me);
    }
}
    public static void main(String[] args) {
        method("zhouzhuofan",(String name)->
        {
//            System.out.println(name);//直接消费（输出）字符串
            System.out.println(new StringBuilder(name).reverse().toString());
        });
        method("zhouzhuofan",(String name)->{
            System.out.println(name.toLowerCase());
        },(String name)->{
            System.out.println(name.toUpperCase());
        });

        String[] arr={"zhouzhuofan01,18","zhouzhuofan02,20","zhouzhuofan03,19"};
        method(arr,(String mes)->{
            System.out.print("姓名："+mes.split(",")[0]);
        },(String mes)->
        {
            System.out.print("年龄："+mes.split(",")[1]);
            System.out.println();
        });



    }

}
