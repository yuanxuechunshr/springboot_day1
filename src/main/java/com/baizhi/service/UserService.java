package com.baizhi.service;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User login(@Param("username") String username,@Param("password") String password);
    void regist(User user);
}
