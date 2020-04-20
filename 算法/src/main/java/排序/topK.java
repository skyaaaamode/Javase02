package 排序;

import java.util.*;

public class topK {
    public void method(int[] a){
        HashMap<Integer, Integer> maps = new HashMap<>();
        int[] ints = new int[10];
        for(int i:a)
        {
            if(maps.containsKey(i))
            {
                maps.put(i,maps.get(i)+1);
            }
            {
                maps.put(i,1);
            }

            int count=maps.get(i);
        }
    }
//    public class TreeMapTest {
//        public static void main(String[] args) {
//            Map<String, String> map = new TreeMap<String, String>(
//                    new Comparator<String>() {
//                        public int compare(String obj1, String obj2) {
//                            // 降序排序
//                            return obj2.compareTo(obj1);
//                        }
//                    });
//            map.put("c", "ccccc");
//            map.put("a", "aaaaa");
//            map.put("b", "bbbbb");
//            map.put("d", "ddddd");
//
//            Set<String> keySet = map.keySet();
//            Iterator<String> iter = keySet.iterator();
//            while (iter.hasNext()) {
//                String key = iter.next();
//                System.out.println(key + ":" + map.get(key));
//            }
//        }
//    }
}
