package org.softclass.teachproject.controller;

import org.softclass.teachproject.pojo.DTO.UserDTO;
import org.softclass.teachproject.pojo.Result;
import org.softclass.teachproject.pojo.entity.User;
import org.softclass.teachproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//接口返回对象转换json格式
@RequestMapping("/user")//路径localhost:8080/user/**
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public Result add (@RequestBody UserDTO userDTO){

        System.out.println(userDTO);
        User addUser = userService.add(userDTO);
        return Result.success(addUser);
    }

}
