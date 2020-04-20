package Demo03;

public class Demotest {
    public static void printName(String name,PersonBuilder p)
    {
        Person x=p.buildPerson(name);
        System.out.println(x);
    }

    public static void main(String[] args) {
        printName("zhouzhuofan",(s)->{
            return new Person(s);
        });
        printName("zhouzhuofan",Person::new);
    }

}
