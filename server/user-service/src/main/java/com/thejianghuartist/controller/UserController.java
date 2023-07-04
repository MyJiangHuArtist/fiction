package com.thejianghuartist.controller;

import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.thejianghuartist.mapper.UserMapper;
import com.thejianghuartist.pojo.User;
import com.thejianghuartist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Autowired
    UserService userService;
}
