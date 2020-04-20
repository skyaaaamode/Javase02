/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class Q10 {
    public int RectCover(int target) {
        int method = method(target, 0, 0);
        return method;

    }
    public int method(int target,int i,int sum){
        if(sum>target){
            return 0;
        }
        if(sum==target){
            return 1;
        }
        return method(target,i+1,sum+2)+method(target,i+1,sum+1);
    }

}
