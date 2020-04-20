import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Demo01Test {
    @Before//初始化方法，在所有测试用例之前使用
    public void init()
    {
        System.out.println("init----");
    }

    @Test
    public void testAdd()
    {
        System.out.println("这是一个测试类");
        Demo01 a=new Demo01();
        int result=a.add(1,2);
        //断言，给定期望值
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub()
    {
        Assert.assertEquals(-1,new Demo01().Sub(1,2));
    }
    @After//在所有的测试用例后资源的释放
    public void close()
    {
        System.out.println("close---");
    }

}
