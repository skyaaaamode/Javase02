import lombok.Data;

public class CloneTest {
    public static void main(String[] args) {
        student student = new student("zzf", 12, new Sex("男"));
        student clone=null;
        try {
             clone =(student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Sex g = new Sex("女");
        if (clone != null) {
            clone.setS(g);
        }
        System.out.println(student);
        System.out.println(clone);

    }
}
@Data
class student implements Cloneable{
    private String name;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", s=" + s +
                '}';
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getS() {
        return s;
    }

    public void setS(Sex s) {
        this.s = s;
    }

    private Sex s;
    public Object clone() throws CloneNotSupportedException {
        student clone =(student) super.clone();
        clone.s=(Sex) s.clone();
        return clone;
    }
    public student(String n,int a,Sex sex){
        name=n;
        age=a;
        s=sex;
    }
}
@Data
class Sex implements Cloneable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Sex(String sex){name=sex;}

}
