package org.itforjava.service.impl;

import org.itforjava.entity.User;
import org.itforjava.mapper.UserMapper;
import org.itforjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public void add(String username, String password) {
        userMapper.add(username,password);
    }

    @Override
    public boolean update(User updateUser) {
        if(userMapper.update(updateUser)){
            return true;
        }else {
            return false;
        }
    }

}
