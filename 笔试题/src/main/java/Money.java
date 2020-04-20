import java.util.*;

public class Money {
    public static void method(ArrayList<Integer> money,int p){
//        Collections.sort(money);
//        int size = money.size();
//        int time=0;
//        int end=0;
//        for (int j=size-1;j>=0;j--)
//        {
//            if(money.get(j)>=p) {
//                time++;
//            }
//            else {
//                end=j;
//                break;
//            }
//
//        }
        int time=0;
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=0;i<=money.size();i++)
        {
            min.add(money.get(i));
            max.add(money.get(i));
        }
        while (!max.isEmpty()&&!min.isEmpty())
        {
            Integer maxValue = max.poll();
            min.remove(maxValue);
            while (maxValue<p&&!max.isEmpty()&&!min.isEmpty())
            {
                Integer minValue = min.poll();
                max.remove(minValue);
                maxValue=minValue+maxValue;

            }
            if(maxValue>=p)
            {
                time++;
            }
        }
        System.out.println(time);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String n = s1[0];
        String  pri= s1[1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<Integer.parseInt(n);i++)
        {
            String[] s2 = scanner.nextLine().split(" ");
            int value=Integer.parseInt(s2[0]);
            int f=Integer.parseInt(s2[1]);
            for (int j=0;j<f;j++)
            {
                list.add(value);
            }

        }
        Money.method(list,Integer.parseInt(pri));
    }
}
