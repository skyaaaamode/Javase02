public class Student {
     int name=0;
     public Student(){
     }
     public void test(){
         name=1;
     }

    public static void main(String[] args) {
        Student my = new My();
        System.out.println(my.name);

    }

}
class My extends Student{
    int name=1;
    public void test(int i){
        name=10;
    }

}
