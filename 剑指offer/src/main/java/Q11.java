/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Q11 {
    public void reOrderArray(int [] array) {
        int less=-1;
        int more=array.length;
        int begin=0;
        while (begin<more){
            if(array[begin]%2==1){
                swap(array,begin++,++less);
            }
            else{
                swap(array,begin,--more);
            }
        }

    }
    public void swap(int [] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void main(String[] args) {

    }

}
