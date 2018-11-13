package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void regist(User user);
    User login(@Param("username") String username, @Param("password") String password);

}
