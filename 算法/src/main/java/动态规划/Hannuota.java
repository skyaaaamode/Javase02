package 动态规划;

/**
 * 汉诺塔
 */
public class Hannuota {
    public static void print(int n){
        if (n>0){
            method(n,"1","2","3");
        }
    }
    public static void method(int n,String from,String to,String help){
        if(n==1){
            System.out.println("move "+n+" from "+from+" to "+to);
            return;
        }
        method(n-1,from,help,to);
        System.out.println("move "+n+" from "+from+" to "+to);
        method(n-1,help,to,from);
    }

    public static void main(String[] args) {
        Hannuota.print(3);
    }


}
