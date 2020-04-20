package Class;

import java.lang.reflect.Constructor;

public class 获取构造方法 {
    public static void main(String[] args) throws Exception {
        Class x=person.class;
        Constructor n1=x.getConstructor();
        Constructor n2=x.getConstructor(String.class,int.class,String.class);
        System.out.println(n1);
        System.out.println(n2);
        Object person=n1.newInstance();
        System.out.println(person);
        Object person02=n2.newInstance("zzf",18,"江干");
        System.out.println(person02);
    }
}
