package Druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        InputStream is=Demo.class.getClassLoader().getResourceAsStream("druid.properties");
        p.load(is);
        DataSource ds= DruidDataSourceFactory.createDataSource(p);
        Connection conn=ds.getConnection();
        System.out.println(conn);

    }
}
