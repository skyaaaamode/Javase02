
public class Q27 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i=0;i<gas.length;i++){
            if(judge(gas,cost,i)){
                return i;
            }
        }
        return -1;

    }
    public boolean judge(int[] gas, int[] cost,int i){

        int pre=i;
        int sum=0;
        while (true)
        {
            if(gas[pre]+sum<cost[pre]){
                return false;
            }
            sum=sum+gas[pre]-cost[pre];
            if(pre==cost.length-1){
                pre=pre+1-cost.length;
            }
            else
            {
                pre=pre+1;
            }
            if(pre==i)
            {
                return true;
            }

        }
    }
}
