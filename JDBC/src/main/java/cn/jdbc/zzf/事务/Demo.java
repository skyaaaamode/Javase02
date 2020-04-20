package cn.jdbc.zzf.事务;

import cn.jdbc.zzf.JavaUtil.JavaUtil;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 银行转账的方法
 */
public class Demo {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        try
        {
            conn= JavaUtil.getConnection();
            conn.setAutoCommit(false);
            String sql1="update count set money=money-? where id=?";
            String sql2="update count set money=money+? where id=?";
            pstmt1= (PreparedStatement) conn.prepareStatement(sql1);
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2= (PreparedStatement) conn.prepareStatement(sql1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn!=null)
                {
                    conn.rollback();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        finally {
            JavaUtil.close(conn,pstmt1);
            JavaUtil.close(null,pstmt2);
        }
    }
}
