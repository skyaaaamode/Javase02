import java.util.HashSet;
import java.util.Objects;

class student implements Comparable<student>
{
    int age;
    String name;
    public student(int age,String name)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(student o) {
        return this.age-o.age ;
    }

}
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<student> x=new HashSet<>();
        student x1=new student(10,"zzf");
        student x2=new student(10,"zzf");
        x.add(x2);
        x.add(x1);
        for (student i:x)
        {
            System.out.println(i);
        }

    }
}
