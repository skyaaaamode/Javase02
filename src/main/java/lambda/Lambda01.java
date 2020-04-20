package lambda;

public class Lambda01 {
    public static void main(String[] args) {
        new Thread(()->
        {
            System.out.println(Thread.currentThread().getName() );
        }).start();
    }
}
