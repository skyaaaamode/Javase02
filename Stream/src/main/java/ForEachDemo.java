import java.util.stream.Stream;

/**
 * 用来遍历流中的数据
 */
public class ForEachDemo {
    public static void main(String[] args) {
        Stream<String> x=Stream.of("zzf01","zzf02","zzf03");
        x.forEach(name-> System.out.println(name));
    }
}
