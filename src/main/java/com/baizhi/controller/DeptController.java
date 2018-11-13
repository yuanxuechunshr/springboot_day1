package com.baizhi.controller;


import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.util.List;


@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    public @ResponseBody String findAll( HttpSession session){
            List<Dept> depts = deptService.findAll();
            session.setAttribute("depts",depts);
            return "redirect:/dept/deptlist.jsp";
    }
    @RequestMapping("/delete")
    public  String delete(Integer id,HttpSession session){
        deptService.delete(id);
        List<Dept> depts = deptService.findAll();
        session.setAttribute("depts",depts);
        return "redirect:/dept/deptlist.jsp";
    }
    @RequestMapping("/findOne")
    public  String findOne( HttpSession session,Integer id){
        Dept dept  = deptService.findOne(id);
        session.setAttribute("dept",dept);
        return "redirect:/dept/updateDept.jsp";
    }
    @RequestMapping("/update")
    public String update(Dept dept,HttpSession session){
        deptService.update(dept);
        List<Dept> depts = deptService.findAll();
        session.setAttribute("depts",depts);
        return "redirect:/dept/deptlist.jsp";
    }
    @RequestMapping("/save")
    public String save(Dept dept,HttpSession session){
        deptService.save(dept);
        List<Dept> depts = deptService.findAll();
        session.setAttribute("depts",depts);
        return "redirect:/dept/deptlist.jsp";
    }
}
