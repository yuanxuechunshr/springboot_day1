package com.baizhi.service;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        deptDao.delete(id);
    }

    @Override
    public Dept findOne(Integer id) {
        return deptDao.findOne(id);
    }

    @Override
    public void save(Dept dept) {
        deptDao.save(dept);
    }

    @Override
    public void update(Dept dept) {
        deptDao.update(dept);
    }
}
