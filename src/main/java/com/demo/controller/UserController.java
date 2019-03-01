package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> users = userService.listUsers();
        return users;
    }

    @RequestMapping("/insertUser")
    public void inserUser()  throws Exception{
        User user = new User();
        user.setId((short)22);
        user.setName("test");
        user.setPwd("test");
        userService.insertUser(user);
    }
}
