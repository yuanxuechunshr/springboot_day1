package com.baizhi.dao;

import com.baizhi.entity.Dept;
import com.baizhi.entity.User;

import java.util.List;

public interface DeptDao {
    List<Dept> findAll();
    void delete(Integer id);
    void update(Dept dept);
    Dept findOne(Integer id);
    void save(Dept dept);
}
