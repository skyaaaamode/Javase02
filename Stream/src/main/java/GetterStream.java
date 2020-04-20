import java.util.*;
import java.util.stream.Stream;

public class GetterStream {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.stream();
        Set b=new HashSet();
        b.stream();
        //把map转换成流
        HashMap<String,String> c=new HashMap<>();

        Set<String> keySet=c.keySet();
        keySet.stream();
        Collection<String> values=c.values();
        values.stream();
        Set<Map.Entry<String,String>> keyvalue=c.entrySet();
        keyvalue.stream();
        //数组转换成Stream流的方式是
        Stream.of(new int[]{1,2,3,4,5});
        Stream.of(1,2,3,4,5);
    }
}
