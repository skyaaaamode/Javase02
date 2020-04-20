package com.cn.request.案例.test;

import com.cn.request.案例.User;
import com.cn.request.案例.UserDao;
import org.junit.Test;


public class UserDaotest {
    @Test
    public void testLogin()
    {
        User LoginUser=new User();
        LoginUser.setUsername("zzf02");
        LoginUser.setPassword("123456");
        System.out.println(new UserDao().login(LoginUser));

    }
}
