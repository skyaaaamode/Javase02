/**
 * 等待唤醒案例wait，notifyall
 */
package MyThread;

import java.util.TreeMap;

public class MyWait {
    public static void main(String[] args) {
        Object x=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行
                while (true)
                {
                    synchronized (x)
                    {
                        System.out.println("等待方法执行");
                        try {
                            x.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("执行结束");
                        System.out.println("--------");
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行
                while (true)
                {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (x)
                    {
                        System.out.println("唤醒方法执行");
                        x.notify();
                    }
                }

            }
        }).start();
    }
}
