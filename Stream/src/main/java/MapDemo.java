import java.util.stream.Stream;

/**
 * 将一个流映射到另一个流中，可以使用map方法
 */
public class MapDemo {
    public static void main(String[] args) {
        Stream<String> x=Stream.of("1","2","3","4","5");
        Stream<Integer> x2=x.map((String name)->Integer.parseInt(name));
        x2.forEach(i-> System.out.println(i));

    }
}
