package com.demo.dao;

import com.demo.entity.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    User selectByPrimaryKey(Short id);

    List<User> selectAll();
}