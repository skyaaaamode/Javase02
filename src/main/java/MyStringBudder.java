public class MyStringBudder {
    public static void main(String[] args) {
        //两种构造函数
        StringBuilder x=new StringBuilder();
        StringBuilder y=new StringBuilder("abc");
        //两种常用成员方法
        x.append(10);//任意数据类型
        System.out.println(x+" "+y);
    }
}
