package 模式;

/**
 * 饿汉式
 */
public class SingleTon {
    public static final SingleTon INSTANCE=new SingleTon();
    private SingleTon(){
    }
    public SingleTon getInstance(){
        return  INSTANCE;
    }
}

/**
 * 静态代码块
 */
class SingleTon02{
    public static final SingleTon02 INSTANCE;
    static {
        INSTANCE=new SingleTon02();
    }
    private SingleTon02(){
    }

}
/**
 *懒汉式
 */
class SingleTon03{
    private static SingleTon03 INSTANCE;

    private SingleTon03(){
    }
    public SingleTon03 getInstance(){
        if(INSTANCE==null){
            synchronized (SingleTon03.class){
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE=new SingleTon03();
                }
            }
        }
        return INSTANCE;
    }
}
class Sington04{
    public static class Inner{
        private static Sington04 INSTANCE=new Sington04();
    }
    private Sington04(){

    }
    public Sington04 getINSTANCE(){
        return Inner.INSTANCE;
    }
}