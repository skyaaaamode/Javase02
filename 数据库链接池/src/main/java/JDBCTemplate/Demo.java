package JDBCTemplate;

import Druid.DruidUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {
    public static void main(String[] args) {
        JdbcTemplate jtp=new JdbcTemplate(DruidUtil.getDataSource());
        String sql="update count set money=10 where id=?";
        int count = jtp.update(sql, 3);
        System.out.println(count);
    }
}
