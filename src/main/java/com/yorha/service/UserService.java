package com.yorha.service;

import com.yorha.entity.User;
import com.yorha.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUsers(){
        return userMapper.selectUsers();
    }
}
