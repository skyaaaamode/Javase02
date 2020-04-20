import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> x=new ArrayList<>();
        x.add(String.valueOf(1));
        x.add(String.valueOf(2));
        x.add(String.valueOf(3));
        x.add(String.valueOf(4));
        x.add(1,String.valueOf(2));
        x.remove(1);
        x.set(1,"A");
        x.get(1);
        System.out.println(x);




    }
}
