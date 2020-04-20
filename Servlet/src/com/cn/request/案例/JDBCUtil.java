package com.cn.request.案例;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 创建一个JDBC的工具类，使用Druid链接池
 */
public class JDBCUtil {
    private static DataSource ds;
    static {
        //1.加载配置文件
        Properties input=new Properties();
        try {
            InputStream is=JDBCUtil.class.getClassLoader().getResourceAsStream("com/cn/request/案例/druid.properties");
            input.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.初始化链接池对象
        try {
            ds= DruidDataSourceFactory.createDataSource(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取链接池对象
     */
public static DataSource getDataSource()
{
    return ds;
}
    /**
     * 获取Connection对象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
