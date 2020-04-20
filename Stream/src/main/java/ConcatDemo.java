import java.util.stream.Stream;

/**
 * 合并两个流
 */
public class ConcatDemo {
    public static void main(String[] args) {
        Stream<String> x=Stream.of("1","2","3","4","5");
        Stream<String> y=Stream.of("1","2","3","4","5");
        Stream<String> z=Stream.concat(x,y);
        z.forEach(i-> System.out.println(i));
    }
}
