package cn.jdbc.zzf.PrepareStatement;

/**
 * 为了预防数据注入的问题存在，sql在进行拼接的时候可以进行破坏
 */

import cn.jdbc.zzf.JavaUtil.JavaUtil;

import java.sql.*;
import java.util.Scanner;

/**
 * 1.通过键盘输入用户名和密码
 *2.判断用户是否登陆成功
 */
public class Demo {
    public boolean login(String username,String password)
    {
        if(username!=null&&password!=null)
        {
            Connection conn=null;
            PreparedStatement pstmt=null;
            ResultSet rs=null;
            try
            {
                conn= JavaUtil.getConnection();
                String sql="select * from users where name=? and password=?";
                pstmt=conn.prepareStatement(sql);
                //给问号赋值
                pstmt.setString(1,username);
                pstmt.setString(2,password);
                rs=pstmt.executeQuery();
                return rs.next();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                JavaUtil.close(conn,pstmt,rs);
            }


        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=input.nextLine();
        System.out.println("请输入密码");
        String password=input.nextLine();
        if(new cn.jdbc.zzf.Login().login(username,password))
        {
            System.out.println("登陆成功");
        }
        else {
            System.out.println("登陆失败");
        }
    }

}

