package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User selectById(String id);

    void insert(User user);

    void updateById(User user);

    void deleteById(String id);
}
