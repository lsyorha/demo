package com.yorha.mapper;

import com.yorha.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectUsers();
}
