/**
 * 矩阵中的路径
 */
public class Q34 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[][] flag = new boolean[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(matrix[i*cols+j]==str[0]){
                   if(help(matrix,rows,cols,str,i,j,0,flag)){
                       return true;
                   }
                }
            }
        }
        return false;

    }
    public boolean help(char[] matrix, int rows, int cols, char[] str,int i,int j,int k,boolean[][] flag)
    {
        int index=i*cols+j;
        if(i>=rows||j>=cols||i<0||j<0||flag[i][j]||matrix[index]!=str[k]){
            return false;

    }
        if(k==str.length){
            return true;
        }
        flag[i][j]=true;
        if(help(matrix,rows,cols,str,i+1,j,k+1,flag)||
                help(matrix,rows,cols,str,i-1,j,k+1,flag)||
                help(matrix,rows,cols,str,i,j+1,k+1,flag)||
                help(matrix,rows,cols,str,i,j-1,k+1,flag))
        {
            return true;
        }
        flag[i][j]=false;
        return false;

    }

}
