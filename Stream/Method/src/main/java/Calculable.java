

/**
 * 计算的接口
 */
public class Calculable {
    public static int method(int number,CALCABLE a)
    {
        return  a.calculate(number);
    }

    public static void main(String[] args) {
        System.out.println(method(-10,s->Math.abs(s)));
        /**
         * 使用方法优化lambda表达式
         * Math类存在
         * abs计算方法是已经存在的
         * 所以利用类名来引用静态方法
         */
        System.out.println(method(-10,Math::abs));
    }
}
