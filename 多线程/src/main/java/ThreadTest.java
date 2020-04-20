/**
 * 实现多线程的两种方式，继承Thread，继承Runable接口
 */
class ThreadTest01 extends Thread{
    public void run(){
        for (int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
class ThreadTest02 extends Thread{
    public void run(){
        for (int i=50;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
public class  ThreadTest{
    public static void main(String[] args) {
        ThreadTest01 threadTest01 = new ThreadTest01();
        ThreadTest02 threadTest02 = new ThreadTest02();
        threadTest01.setName("kkk");
        threadTest02.setName("ggg");
        threadTest01.start();
        threadTest02.start();

    }
}
