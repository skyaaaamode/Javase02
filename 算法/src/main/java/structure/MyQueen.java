package structure;

/**
 * 用数组实现队列
 */
public class MyQueen {
    public int queeSzie;
    public int[] arr;
    public int queenSzie;
    public int start;
    public int end;
    public MyQueen(int size){
        if(size<0){
            throw new IllegalArgumentException("size参数错误");
        }
        arr = new int[size];
        queenSzie=size;
        start=0;
        end=0;
    }
    public void push(int value){
        if(queenSzie==arr.length){
            throw new ArrayIndexOutOfBoundsException("队列满了");
        }
        start=getnext(start);
        queenSzie++;
    }
    public int getnext(int index){
        return index==arr.length-1?0:(index+1);
    }
    public void pop(int value){
        if(queenSzie==0){
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        end=getnext(end);
        queenSzie--;
    }
}
