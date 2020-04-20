package cn.jdbc.zzf.JavaUtil;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * 手写一个
 * 写一个JDBC的工具类
 */
public class JavaUtil {
    /**
     * 获取链接
     * @return 返回链接
     */
    private static String url;
    private static String username;
    private static String password;
    private static String driver;
    static
    {
       Properties input=new Properties();
        try {
            //input.load(new FileReader("D:\\Javase02\\JDBC\\src\\main\\resources\\javautil.properties"));
           //用classload获取preperties文件的绝对路径
            ClassLoader x=JavaUtil.class.getClassLoader();
           URL res=x.getResource("javautil.properties");
            String path=res.getPath();
            System.out.println(path);
            input.load(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        url=input.getProperty("url");
        username=input.getProperty("username");
        password=input.getProperty("password");
        driver=input.getProperty("driver");
    }
    public static Connection getConnection()
    {
        try {
            return DriverManager.getConnection(url,username,password);
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void close(Connection conn,Statement stmt)
    {
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
    public static void close(Connection conn,Statement stmt,ResultSet rs)
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

    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            Class.forName(JavaUtil.driver);
            conn=JavaUtil.getConnection();
            String sql="select * from emp";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getDate(5)+rs.getDouble(6)+ rs.getDouble(7)+rs.getInt(8));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JavaUtil.close(conn,stmt,rs);

    }

}
