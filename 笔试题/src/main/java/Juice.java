import java.util.HashMap;
import java.util.Scanner;

public class Juice {
    public static void method(int[] group){
        if(group==null||group.length<1)
        {
            System.out.println("出错了");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:group){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        int sum=0;
        for (int i:map.values())
        {
            sum=sum+i/2+i%2;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String worker = s1[0];
        String  kind= s1[1];
        String group = scanner.nextLine();
        String[] s2 = group.split(" ");
        int[] ints = new int[s2.length];
        for (int i=0;i<s2.length;i++)
        {
            ints[i]=Integer.parseInt(s2[i]);
        }
        Juice.method(ints);

    }
}
