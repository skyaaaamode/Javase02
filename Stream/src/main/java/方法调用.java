@FunctionalInterface
interface printable
{
    public abstract void print(String s);

}
class Method
{
    public void printUpclass(String s)
    {
        System.out.println(s.toUpperCase());
    }
}
public class 方法调用 {
    public static void print01(printable p)
    {
        p.print("HellowWorld");
    }

    public static void main(String[] args) {
        print01(s-> System.out.println(s));
        print01(System.out::println);//方法引用的改写
        Method method = new Method();
        print01(method::printUpclass);

    }

}
