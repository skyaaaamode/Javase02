package 线程间通信;


class MyLock
{
    public static Object o=new Object();
}
class RunnableTest01 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            synchronized (MyLock.o){
                System.out.println(1);
                MyLock.o.notify();
                try {
                    MyLock.o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class RunnableTest02 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            synchronized (MyLock.o){
                System.out.println(2);
                MyLock.o.notify();
                try {
                    MyLock.o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class NotifyTest {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new RunnableTest01());
        Thread thread02= new Thread(new RunnableTest02());
        thread01.start();
        thread02.start();

    }
}
