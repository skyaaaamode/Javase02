package Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 创建一个Druid的工具类
 */
public class DruidUtil {
    private static DataSource ds;
    static {
        Properties p=new Properties();
        try {
            p.load(DruidUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        };
        try {
            ds=DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    public static void close(Connection conn, Statement stmt, ResultSet rs)
    {
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
    public static  DataSource getDataSource()
    {
        return ds;
    }

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
             conn=DruidUtil.getConnection();
             String sql="select * from count where id=?";
             pstmt=conn.prepareStatement(sql);
             pstmt.setInt(1,2);
             rs=pstmt.executeQuery();
             while (rs.next())
             {
                 System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
             }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DruidUtil.close(conn,pstmt,rs);
        }

    }


}
