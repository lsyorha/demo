package com.yorha.controller;

import com.yorha.entity.User;
import com.yorha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String userPage(){

        List<User> users = userService.findUsers();
        for (User user : users) {
            System.out.println(user);
//            -Dfile.encoding=UTF-8
        }

        return "/hello";
    }
}
