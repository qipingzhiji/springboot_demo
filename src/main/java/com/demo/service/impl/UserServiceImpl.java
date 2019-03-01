package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userDao;

    @Override
    public List<User> listUsers() {
        return userDao.selectAll();
    }

    @Override
    public void insertUser(User user) {
        userDao.insert(user);
    }
}
