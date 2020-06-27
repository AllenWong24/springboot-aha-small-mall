package com.aha.smallmall.controller;

import com.aha.smallmall.dao.UsersRepository;
import com.aha.smallmall.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/")
    public String hello() {
        Users users = new Users();
        users.setName("allen");
        users.setEmail("allen@163.com");
        usersRepository.save(users);
        return "Hello >_<";
    }
}
