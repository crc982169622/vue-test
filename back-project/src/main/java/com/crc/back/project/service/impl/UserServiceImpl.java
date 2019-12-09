package com.crc.back.project.service.impl;

import com.crc.back.project.domain.User;
import com.crc.back.project.mapper.UserMapper;
import com.crc.back.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: chenrencun
 * @Date: 2019/12/9 16:57
 * @Description: 描述
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.findList();
    }
}
