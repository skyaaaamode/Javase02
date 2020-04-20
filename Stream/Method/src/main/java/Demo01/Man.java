package Demo01;

public class Man extends Human {
    @Override
    public void sayHellow() {
        System.out.println("hellow i am man");
    }
    public void method(Gteetable p)
    {
        p.greet();
    }
    public void show()
    {
        method(()->{
            Human a=new Human();
            a.sayHellow();
        });
        method(()->super.sayHellow());
        method(super::sayHellow);//方法体
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
