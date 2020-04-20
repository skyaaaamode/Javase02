import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public class Zhuanfa {
    public static void method(ArrayList<String> luyou,ArrayList<String> aim){
        HashMap<String, Integer> first = getFirst(luyou, aim);
        if(first.size()<luyou.size()){
            System.out.println(0);
        }


    }
    public static HashMap<String,Integer> getFirst(ArrayList<String> luyou,ArrayList<String> aim)
    {
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        for(int i=0;i<luyou.size();i++){
            for (int j=0;j<aim.size();j++){
                if(aim.get(j)==luyou.get(i)){
                    if(!maps.containsKey(luyou.get(i)))
                    {
                        maps.put(luyou.get(i),j);
                    }

                }
            }
        }
        return maps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        ArrayList<String> luyou = new ArrayList<>();
        for (int i=0;i<l;i++){
            String s = scanner.nextLine();
            luyou.add(s);
        }
        int v = Integer.parseInt(scanner.nextLine());
        ArrayList<String> aim = new ArrayList<>();
        for (int i=0;i<v;i++){
            String s = scanner.nextLine();
            aim.add(s);
        }
        Zhuanfa.method(luyou,aim);



    }
}
