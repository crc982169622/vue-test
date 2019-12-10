package com.crc.back.project.controller;

import com.crc.back.project.domain.User;
import com.crc.back.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: chenrencun
 * @Date: 2019/12/9 17:03
 * @Description: 描述
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findList")
    public List<User> findList() {
        return userService.findList();
    }
}
