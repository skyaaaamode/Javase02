/**
 * 斐波那契数列
 */
public class Q07 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
