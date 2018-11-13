package com.baizhi.service;

import com.baizhi.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    void delete(Integer id);
    Dept findOne(Integer id);
    void update(Dept dept);
    void save(Dept dept);
}
