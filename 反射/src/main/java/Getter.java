/**
 * 获取class类对象的三种方式
 */
class person
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Getter {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c01=Class.forName("person");
        System.out.println(c01);
        Class c02=person.class;
        System.out.println(c02);
        Class c03=new person("zhouzhuofan",18).getClass();
        System.out.println(c03);
        System.out.println(c02==c01);//同一个字节码文件在内存中只有一个

    }
}
