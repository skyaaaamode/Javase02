/**
 * 生成线程池   concurent包下的Executor类中的newFixedThreadPool方法
 */
package MyThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Runnableimp implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->"+"执行线程");
    }
}
public class MyExecutors {
    public static void main(String[] args) {
        ExecutorService x= Executors.newFixedThreadPool(2);//创建线程池并返回对象
        x.submit(new Runnableimp());//接收线程任务
        x.submit(new Runnableimp());
        x.submit(new Runnableimp());
        x.shutdown();//销毁线程池
    }
}
