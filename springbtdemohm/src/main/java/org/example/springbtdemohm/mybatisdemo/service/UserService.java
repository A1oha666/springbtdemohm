package org.example.springbtdemohm.mybatisdemo.service;

import org.example.springbtdemohm.mybatisdemo.pojo.User;

public interface UserService {
    public User findById(Integer id);
}
