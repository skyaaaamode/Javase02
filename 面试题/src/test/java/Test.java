import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test
{
    @org.junit.Test
    public void test01() throws UnsupportedEncodingException {
        byte[] src = new byte[0],dst;
        dst=new String(src,"GBK").getBytes("UTF-8");

    }
    @org.junit.Test
    public void test02() throws UnsupportedEncodingException {
        char i=(char)2;
        System.out.println(i);
    }
    @org.junit.Test
    public void test03() throws UnsupportedEncodingException {
       String s="123456";
        String substring = s.substring(1, 6);
        System.out.println(substring);
    }
    @org.junit.Test
    public void test04() throws UnsupportedEncodingException {
        LinkedList<Object> objects = new LinkedList<>();

        System.out.println(2*23*4);
    }
    @org.junit.Test
    public void test05() throws UnsupportedEncodingException {
        LinkedHashMap<Object, Object> x = new LinkedHashMap<>();
        x.put("w1",1);
        x.put("w2",2);
        x.put("w3",3);
        x.remove("w1");
        System.out.println();
        String s="addd";
        String replace = s.replace('a', 'c');
        System.out.println(replace);
    }
    @org.junit.Test
    public void test06() throws UnsupportedEncodingException {
        PriorityQueue<Integer> min = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        min.add(1);
        min.add(9);
        min.add(9);
        min.add(6);
        min.add(4);
        min.add(2);
        min.add(2);
        System.out.println(min.poll());
    }
    public String str="123";
    public char[] gg={'a','b','c'};
    public void chage(String s,char[] xx){
        s="xx";
        xx[0]='g';
    }
    @org.junit.Test
    public void test07() throws UnsupportedEncodingException {
        chage(str,gg);
        System.out.println(str);
        System.out.println(gg.toString());
    }
    @org.junit.Test
    public void test08() throws UnsupportedEncodingException {
       String s="123456";
       String s1="234";
        String s2="2350";
        System.out.println(s.contains(s1)+" "+s.contains(s2));
    }
}