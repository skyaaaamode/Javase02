package cn.jdbc.zzf;
/**
 * JDBC的快速入门
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my","root","zzf");
        //定义sql语句
        String sql="update COUNT set money=500 where id=1";
        Statement stmt=conn.createStatement();
        int count=stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();

    }
}
