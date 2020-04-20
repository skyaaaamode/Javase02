package lambda;

import java.util.Arrays;
import java.util.Comparator;

class person
{
    int age;
    String name;
    public person()
    {

    }
    public person(int age,String nama)
    {
        this.age=age;
        this.name=nama;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Example02 {
    public static void main(String[] args) {
        person[] arr={
                new person(1,"zzf"),
                new person(2,"zf"),
                new person(3,"z")

        };
//        Arrays.sort(arr, new Comparator<person>() {
//            @Override
//            public int compare(person o1, person o2) {
//                return o1.age-o2.age;
//            }
//        });
        Arrays.sort(arr, (person o1, person o2) ->{
            return o1.age-o2.age;
        } ) ;
        for (person i:arr)
        {
            System.out.println(i);
        }

    }
}
