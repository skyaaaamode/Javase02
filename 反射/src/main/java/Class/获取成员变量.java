package Class;

import java.lang.reflect.Field;

public class 获取成员变量 {
    public static void main(String[] args) throws Exception {
        Class x=person.class;
        //获取成员变量
        Field[] field=x.getFields();//获取所有public修饰的成员变量
        for (Field i:field)
        {
            System.out.println(i);
        }
        //field的方法
        person gg=new person("zzf",18,"安徽");
        Field a=x.getField("location");
        System.out.println(a.get(gg));
        a.set(gg,"江干");
        System.out.println(a.get(gg));


    }
}
