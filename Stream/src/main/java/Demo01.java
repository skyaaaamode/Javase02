import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> after=new ArrayList<>();
        result.add("张无忌");
        result.add("赵敏");
        result.add("周芷若");
        result.add("张三丰");
        result.add("张三");
        for (String i:result)
        {
            if(i.startsWith("张"))
            {
                if(i.length()==3)
                {
                    after.add(i);
                    System.out.println(i);
                }
            }
        }
        //用Stream流进行操作
        result.stream().filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
        .forEach(name-> System.out.println(name));

    }
}
