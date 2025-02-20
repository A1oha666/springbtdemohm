package org.example.springbtdemohm.mybatisdemo.controller;

import org.example.springbtdemohm.mybatisdemo.pojo.User;
import org.example.springbtdemohm.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }
}
