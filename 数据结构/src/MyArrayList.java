
import java.util.Iterator;

/**
 * 自己实现的myLinkList
 */
public class MyArrayList<AnyType> implements Iterator<AnyType> {

    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }

    private AnyType[] item;
    private int size;
    private static final int Default_Capcicy = 10;

    public MyArrayList() {
        clear();
    }

    public void clear() {
        size = 0;
        ensureCapacity(Default_Capcicy);
    }

    public int getsize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void trimToSize() {
        ensureCapacity(getsize());
    }

    public AnyType get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return item[index];
    }

    public AnyType set(int index, AnyType newval) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        AnyType old = item[index];
        item[index] = newval;
        return old;
    }

    public void add(AnyType newval) {
        add(size, newval);
    }

    public void add(int index, AnyType newval) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == item.length)//数组满了
        {
            ensureCapacity(size * 2 + 1);
        }
        size++;
        for (int i = index + 1; i < size; i++) {
            item[i] = item[i - 1];
        }
        item[index] = newval;
    }

    public AnyType remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int start = index;
        AnyType result = item[index];
        for (int i = start; i < size - 1; i++) {
            item[i] = item[i + 1];
        }
        size--;
        return result;

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public AnyType next() {
        return null;
    }

    private class ArrayListIterator implements java.util.Iterator<AnyType> {
        private int cur = 0;

        @Override
        public boolean hasNext() {
            return cur < size;
        }

        @Override
        public AnyType next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return item[cur++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(--cur);

        }
    }

    public void ensureCapacity(int capcicy) {
        /**
         * 比size小的能力值不做处理
         */
        if (capcicy < size) {
            return;
        } else {
            AnyType[] old = item;
            item = (AnyType[]) new Object[capcicy];
            int i = 0;
            while (i < size) {
                item[i] = old[i];
                i++;
            }

        }

    }

    public void print() {
        for (AnyType i : item) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> test = new MyArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.trimToSize();
        test.print();
        System.out.println(test.getsize());


    }
}
