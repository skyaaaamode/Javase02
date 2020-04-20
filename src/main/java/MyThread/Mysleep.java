package MyThread;

/**
 * 用sleep方法模拟秒钟值
 */
public class Mysleep {
    public static void main(String[] args) {
        for (int i=0;i<60;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
