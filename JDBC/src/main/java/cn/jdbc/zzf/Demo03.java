package cn.jdbc.zzf;

import java.sql.*;

/**
 * 修改记录
 */
public class Demo03 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql:///my","root","zzf");
            String sql="update  COUNT set money=2500 where id=4";
            stmt=conn.createStatement();
            int count=stmt.executeUpdate(sql);
            System.out.println(count);
            if(count>0)
            {
                System.out.println("执行成功");
            }
            else
            {
                System.out.println("执行失败");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if(stmt!=null)
            {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null)
            {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
