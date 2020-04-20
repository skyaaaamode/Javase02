package Demo02;

public class Husband {
    public void buyHouse()
    {
        System.out.println("北京二环内买一个四合院");
    }
    public void marry(Richable p)
    {
        p.buy();
    }
    public void soHappy()
    {
        marry(()->{
            this.buyHouse();
        });
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }


}
