package Example;

import java.util.ArrayList;
import java.util.stream.Stream;

class person
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        ArrayList<String> two=new ArrayList<>();
        one.add("张无忌");
        one.add("赵敏");
        one.add("周芷若");
        one.add("张三丰");
        one.add("张三");
        two.add("张无忌");
        two.add("赵敏");
        two.add("周芷若");
        two.add("张三丰");
        two.add("张三");
        Stream<String> oneStream=one.stream().filter(name->name.length()>=3).limit(3);
        Stream<String> twoStream=two.stream().filter(name->name.startsWith("张")).skip(2);
        Stream<String> res=Stream.concat(oneStream,twoStream);
        res.map(name->new person(name)).forEach(name-> System.out.println(name));


    }
}
