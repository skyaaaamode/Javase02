package LambdaDdemo;

/**
 * 函数式接口的实现方式
 */
public class Demo01test {
    public static void show(Demo01 e)
    {
        e.mothod();
    }
    public static void main(String[] args) {
        show(new Demo01() {
            @Override
            public void mothod() {
                System.out.println("xiexie");
            }
        });
        show(()->{
            System.out.println("好的");
        });
        show(()-> System.out.println("简单"));

    }
}
