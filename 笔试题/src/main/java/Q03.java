/**
 * 给定两个数A、B（0，100000），求 A^B 中最后三位数是多少。请简要描述你的思路。
 */
public class Q03 {
    public static int getPow(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        if(a==0)
        {
            return 0;
        }
        return getPow(a,b/2)*getPow(a,b/2)%1000;
    }
}
