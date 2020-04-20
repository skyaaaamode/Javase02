package 线程间通信;

import java.util.ArrayList;

/**
 * 农夫和一筐苹果
 */

class Kuang {
    public static int size=10;
    public static ArrayList<String> kuang=new ArrayList<String>();
}
class  Farmer implements Runnable{

    @Override
    public void run() {
        while (true){
            synchronized (Kuang.kuang){
                if(Kuang.kuang.size()==Kuang.size){
                    try {
                        Kuang.kuang.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                   Kuang.kuang.add("apple");
                   Kuang.kuang.notify();
                   System.out.println("农夫往里放一个苹果，当前苹果数量是"+Kuang.kuang.size());
                }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }
class Kid implements Runnable{

    @Override
    public void run() {
        while (true){
            synchronized (Kuang.kuang){
                if(Kuang.kuang.size()==0){
                    try {
                        Kuang.kuang.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Kuang.kuang.remove("apple");
                System.out.println("小孩吃了一个苹果，当前苹果数量是"+Kuang.kuang.size());
                Kuang.kuang.notify();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class AppleTest {

    public static void main(String[] args) {
        Thread thread01 = new Thread(new Farmer());
        Thread thread02 = new Thread(new Kid());
        thread01.start();
        thread02.start();
    }
}
