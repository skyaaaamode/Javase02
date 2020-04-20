package cn.jdbc.zzf.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class person
{
    private int id;
    private String ename;
    private String jod_id;
    private int mgr;
    private Date joindate;
    private double salary;
    private double bonus;
    private int dept_id;

    public person(int id, String ename, String jod_id, int mgr, Date joindate, double salary, double bonus, int dept_id) {
        this.id = id;
        this.ename = ename;
        this.jod_id = jod_id;
        this.mgr = mgr;
        this.joindate = joindate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept_id = dept_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJod_id() {
        return jod_id;
    }

    public void setJod_id(String jod_id) {
        this.jod_id = jod_id;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", jod_id='" + jod_id + '\'' +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }
}
/**
 * 查询表并将记录封装成集合
 */

public class Demo {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql:///my","root","zzf");
            String sql="select * from emp";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            List<person> result=new ArrayList<person>();
            while (rs.next())
            {
                result.add(new person(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getDate(5),rs.getDouble(6), rs.getDouble(7),rs.getInt(8)));
            }
            for (person i:result)
            {
                System.out.println(i);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
