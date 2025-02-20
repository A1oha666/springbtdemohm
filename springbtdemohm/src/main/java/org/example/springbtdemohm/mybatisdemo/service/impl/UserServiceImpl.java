package org.example.springbtdemohm.mybatisdemo.service.impl;

import org.example.springbtdemohm.mybatisdemo.pojo.User;
import org.example.springbtdemohm.mybatisdemo.mapper.UserMapper;
import org.example.springbtdemohm.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id){
        return userMapper.findById(id);
    }
}
