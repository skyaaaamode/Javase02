package Class;

/**
 * 获取class类对象的三种方式
 */
class person
{
    private String name;
    private int age;
    public String location;

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

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    public person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }
    public person()
    {

    }
    public void eat()
    {
        System.out.println("2个大包子");
    }
    public void eat(String j)
    {
        System.out.println("3个大包子");
    }
}
