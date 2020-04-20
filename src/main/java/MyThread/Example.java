/**
 * 线程安全问题的代码
 */
package MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//不安全
class sale implements Runnable
{
    private int ticket;
    public sale(int ticket)
    {
        this.ticket=ticket;
    }
    @Override
    public void run() {
        while (true)
        {
            if(ticket>0)
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--->"+ticket+"票");
                ticket--;
            }
            else
            {

                System.out.println("票卖完了");
                break;
            }

        }

    }
}
class saleF3 implements Runnable {
    //用lock接口
    Lock l = new ReentrantLock();

    private int ticket;

    public saleF3(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true) {
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "--->" + ticket + "票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    l.unlock();
                }

            }
            l.unlock();
        }
    }
}
class saleF2 implements Runnable
{
    private int ticket;
    public saleF2(int ticket)
    {
        this.ticket=ticket;
    }
    @Override
    public void run() {
        payTicket();


    }
    public synchronized void payTicket()
    {
        while (true)
        {
            if(ticket>0)
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--->"+ticket+"票");
                ticket--;
            }
            else
            {

                System.out.println("票卖完了");
                break;
            }

        }
    }
}
class saleF implements Runnable
{
    private int ticket;
    Object x=new Object();
    public saleF(int ticket)
    {
        this.ticket=ticket;
}
    @Override
    public void run() {
        while (true)
        {
            synchronized (x)
            {
                if(ticket>0)
                {
                    System.out.println(Thread.currentThread().getName()+"--->"+ticket+"票");
                    ticket--;
                }

            }

        }

    }
}

public  class Example {
    public static void main(String[] args) {
//        Runnable a=new sale(100) ;
//        Runnable af=new saleF(100) ;
        Runnable af2=new saleF(100) ;

//        Thread a1=new Thread(a);
//        Thread a2=new Thread(a);
//        Thread a3=new Thread(a);
//        a1.start();
//        a2.start();
//        a3.start();
        Thread a1=new Thread(af2);
        Thread a2=new Thread(af2);
        Thread a3=new Thread(af2);
        a1.start();
        a2.start();
        a3.start();

    }

}
