import java.util.stream.Stream;

/*
将流进行过滤并形成新的数据流
 */
public class FilterDemo {
    public static void main(String[] args) {
        Stream<String> x=Stream.of("张三丰","张无忌","赵敏");
        x.filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
    }
}
