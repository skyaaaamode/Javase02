package Class;

import java.lang.reflect.Method;

public class 获取成员方法 {
    public static void main(String[] args) throws Exception{
        Class x=person.class;
        Method a=x.getMethod("eat");
        Method a01=x.getMethod("eat",String.class);
        Object n=x.newInstance();
        a.invoke(n);
        a01.invoke(n,"s");

        //获取所有public修饰的方式
        Method[] jj=x.getMethods();
        for (Method i:jj)
        {
            System.out.println(i);
            System.out.println(i.getName());//获取方法名
        }

    }
}
