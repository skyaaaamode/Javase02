package cn.jdbc.zzf;

import cn.jdbc.zzf.JavaUtil.JavaUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 1.通过键盘输入用户名和密码
 *2.判断用户是否登陆成功
 */
public class Login {
    public boolean login(String username,String password)
    {
        if(username!=null&&password!=null)
        {
            Connection conn=null;
            Statement stmt=null;
            ResultSet rs=null;
            try
            {
                conn= JavaUtil.getConnection();
                String sql="select * from users where name='"+username+"' and password='"+password+"'";
                stmt=conn.createStatement();
                rs=stmt.executeQuery(sql);

                    return rs.next();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                JavaUtil.close(conn,stmt,rs);
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
        if(new Login().login(username,password))
        {
            System.out.println("登陆成功");
        }
        else {
            System.out.println("登陆失败");
        }
    }

}
