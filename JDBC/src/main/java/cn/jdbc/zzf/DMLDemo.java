package cn.jdbc.zzf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *1.在count表添加一条记录
 * 2.在count表删除一条记录
 * 3.在count表修改一条记录
 */
public class DMLDemo {
    public static void main(String[] args) {
        Statement stmt=null;
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql="insert into COUNT values (4,'zzf03',2000)";
             conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","zzf");
             stmt=conn.createStatement();
            int count=stmt.executeUpdate(sql);
            System.out.println(count);
            if(count>0)
            {
                System.out.println("添加成功");
            }
            else
            {
                System.out.println("添加失败");
            }
        } catch (Exception e)
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
