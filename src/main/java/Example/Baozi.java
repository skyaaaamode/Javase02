/**
 * 等待--通信示例
 * 资源类：包子类（皮，包子馅，包子的状态）
 * 生产者：包子铺，线程类，设置线程任务，读对于包子的状态进行判断，1）有包子，wait() 2)无包子
 * 生产包子，交替生产两种包子 i%2==0，生产完成后，修改包子的属性为true
 *包子铺生产完包子，通知吃货线程吃包子
 * 吃货线程：设置线程任务1）有包子 吃包子，修改包子状态，吃货唤醒包子铺线程生产包子2）无包子 wait（），通知生产包子
 * 测试类：  main方法
 */
package Example;
class  B
{
    //资源类：包子类（皮，包子馅，包子的状态）
    String p;
    String x;
    boolean status=false;
}
class Baozipu extends Thread
{
    private B baozi;
    public Baozipu(B x)
    {
        baozi=x;
    }

    @Override
    public void run() {
        int count=0;
        //添加循环
        while (true)
        {
            synchronized (baozi)
            {
                if (baozi.status==true)
                {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0)
                {
                    baozi.p="薄皮";
                    baozi.x="三鲜";
                }
                else
                {
                    baozi.p="冰皮";
                    baozi.x="牛肉大葱";
                }
                count++;
                System.out.println("正在生产"+baozi.p+baozi.x+"的包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.status=true;
                baozi.notify();;
                System.out.println("包子已经做好，准备开吃");
        }
        }

    }
}
class chihuo extends Thread
{
    private B baozi;
    public chihuo(B x)//除了基本类型都是引用地址传递
    {
        baozi=x;
    }
    @Override
    public void run() {
        while (true)
        {
            synchronized (baozi)
            {
                if(baozi.status==false)
                {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+baozi.p+baozi.x);
                baozi.status=false;
                baozi.notify();
                System.out.println("--------------------");
            }
        }
    }
}
public class Baozi {
    public static void main(String[] args) {
        B x=new B();
        new Baozipu(x).start();
        new chihuo(x).start();
    }

}
