package MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> x=new ArrayList<String>();
        x.add("zzf01");
        x.add("zzf02");
        x.add("zzf03");
        x.add("zzf04");
        //获取迭代器
        Iterator<String> it=x.iterator();//返回的是iterator对象
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
//        for(;it.hasNext();)
//        {
//            System.out.println(it.next());
//        }

    }
}
