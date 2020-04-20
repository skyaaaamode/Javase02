package cn.jdbc.zzf;

import java.sql.*;

/**
 * DQL语法
 */
public class Demo065 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql:///my","root","zzf");
            String sql="select * from count ";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
//            rs.next();
//            int id=rs.getInt(1);
//            String name=rs.getString(2);
//            int money=rs.getInt(3);
//            System.out.println(id+"-"+name+"-"+money);
            /**
             * ResultSet遍历操作
             */
            while (rs.next())
            { int id=rs.getInt(1);
            String name=rs.getString(2);
            int money=rs.getInt(3);
            System.out.println(id+"-"+name+"-"+money);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if(rs!=null)
            {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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

