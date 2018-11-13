package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
     public String test(){
        return "index";
    }

    @RequestMapping("/findAll")
    public  @ResponseBody List<User> findAll(){
        return userService.findAll();
    }
}
