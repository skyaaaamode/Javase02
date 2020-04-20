package 锁;

public class DeaLock{
    public static synchronized void B(){
        A();
        System.out.println("B");
    }
    public static synchronized void A(){
        B();
        System.out.println("A");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                B();
            }
        });
        Thread thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                A();
            }
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
        thread02.start();
    }
}
