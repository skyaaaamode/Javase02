import LambdaDdemo.MessageDemo;

/**
 * 日志案例
 */
public class LogDemo {
    //根据日志的级别显示日志的信息
    public  static void method(int level,String message)
    {
        if(level==1)
        {
            System.out.println(message);
        }
    }
    public static void method(int level, MessageDemo m1)
    {
        if(level==1)
        {
            System.out.println(m1.buildMessage());
        }
    }

    public static void main(String[] args) {
        String mes01="Hellow";
        String mes02="World";
        String mes03="Java";
//        method(1,mes01+mes02+mes03);
        /**
         * 存在性能浪费,将拼接字符串作为参数，各个字符串一定要拼接，存在性能浪费，使用lambda接口
         * 只有当满足条件时，才拼接字符串，延迟拼接
         */
         method(1,()->{return mes01+mes02+mes03;});



    }
}
