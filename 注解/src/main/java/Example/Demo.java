package Example;

import Demo02.MyAnno;

@MyAnotion(ClassName="Demo",MethodName = "show")//常用来配置文件
public class Demo {
    public static void main(String[] args) {
        Class<Demo> x=Demo.class;
        MyAnotion a=x.getAnnotation(MyAnotion.class);
        String classname=a.ClassName();
        String methodname=a.MethodName();
        System.out.println(classname+":"+methodname);
    }
}
