import java.util.ArrayList;
import java.util.Collections;

/**
 * addAll
 */
public class MyCollections {
    public static void main(String[] args) {
        ArrayList<Integer> x=new ArrayList<>();
        Collections.addAll(x,1,2,3,4,5);
        Collections.shuffle(x);
        System.out.println(x);
        Collections.sort(x);
        System.out.println(x);

    }
}
