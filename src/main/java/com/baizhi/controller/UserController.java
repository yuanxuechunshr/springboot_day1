package com.baizhi.controller;

import com.baizhi.entity.Dept;
import com.baizhi.entity.User;
import com.baizhi.service.DeptService;
import com.baizhi.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    DeptService deptService;
    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        User user1 = userService.login(user.getUsername(),user.getPassword());
        session.setAttribute("user1",user1);
        if (user1!=null){
            List<Dept> depts = deptService.findAll();
            session.setAttribute("depts",depts);
            return "redirect:/dept/deptlist.jsp";
        }
        return "redirect:/user/login.jsp";
    }
    @RequestMapping("/regist")
    public String regist(User user){

        userService.regist(user);
        return "redirect:/user/login.jsp";
    }



}
