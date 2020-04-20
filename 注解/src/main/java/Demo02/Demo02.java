package Demo02;

public class Demo02 {
    @Override
    public String toString()
    {
        return super.toString();
    }
    @Deprecated
    public void show01()
    {

    }
    @SuppressWarnings("all")//压制所有警告
    public void show02() //代替show01
    {

    }

    public static void main(String[] args) {
        new Demo02().show01();

    }

}
