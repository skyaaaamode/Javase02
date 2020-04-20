package MyThread;

/**
 * 尝试第一个多线程程序
 */
class MyRunnable implements Runnable
{

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
        }
        public MyRunnable()
        {
            super();
        }


}
class  MyThread extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("M:"+i);
        }
    }
}
public class MyFirstThread
{
    public static void main(String[] args) {
        MyThread a=new MyThread();
        MyRunnable a2=new MyRunnable();
        Thread a3=new Thread(a2);
        a3.start();
        a.start();
        for (int i=0;i<10;i++)
        {
            System.out.println("main"+i);
        }
        //第三种方法用内部类的实现
        new Thread()
        {
            @Override
            public void run() {
                for (int i=0;i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }).start();
        //用lambda来重新写run方法

    }
}
