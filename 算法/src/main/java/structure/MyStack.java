package structure;

import 排序.BucketSort;

/**
 * 用数组实现大小固定的栈
 */
public class MyStack {
    public  int stackSize;
    public  int[] arr;
    public MyStack(int size){
        if(size<0){
            throw new IllegalArgumentException("数组越界");
        }
        arr = new int[size];
        stackSize=0;
    }
    public void push(int value){
        if(stackSize==arr.length){
            throw new ArrayIndexOutOfBoundsException("栈满了");
        }
        arr[stackSize++]=value;
    }
    public int peek(){
        if(stackSize==0){
            throw new ArrayIndexOutOfBoundsException("栈空了");
        }
        int value=arr[--stackSize];
        arr[stackSize]=0;
        return (value);
    }
    public void pop(){
        if(stackSize==0){
            throw new ArrayIndexOutOfBoundsException("栈空了");
        }
        arr[--stackSize]=0;
    }
    public boolean isEmpty(){
        return stackSize==0;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        BucketSort.print(myStack.arr);
        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();
        BucketSort.print(myStack.arr);
    }

}
