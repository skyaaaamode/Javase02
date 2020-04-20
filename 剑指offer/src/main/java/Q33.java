/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），
 * 因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Q33 {
    public int blockSum(int i){
        int sum=0;
        if(i<10){
            return i;
        }
        while(i!=0){
            sum=sum+i%10;
            i=i/10;
        }
        return sum;
    }
    public int findWay(int[][] flag,int i,int j,int maxNum ){
        if(i<0||i>=flag.length||j<0||j>=flag[0].length||flag[i][j]==1||blockSum(i)+blockSum(j)>maxNum){
            return 0;
        }
        flag[i][j]=1;
        return 1+findWay(flag,i+1,j,maxNum)+findWay(flag,i-1,j,maxNum)+
                findWay(flag,i,j-1,maxNum)+findWay(flag,i,j+1,maxNum);
    }
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag=new int[rows][cols];
        return findWay(flag,0,0,threshold);
    }


}
