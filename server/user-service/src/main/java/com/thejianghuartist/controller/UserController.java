package com.thejianghuartist.controller;

import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.thejianghuartist.dto.UserLoginDTO;
import com.thejianghuartist.mapper.UserMapper;
import com.thejianghuartist.pojo.User;
import com.thejianghuartist.service.UserService;
import com.thejianghuartist.util.R;
import com.thejianghuartist.util.REnum;
import com.thejianghuartist.vo.UserVO;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登入
     * @param loginDTO
     * @return
     */
    @RequestMapping(path = "/user",method = {RequestMethod.GET, RequestMethod.POST})
    public R loginUser(@RequestBody UserLoginDTO loginDTO){
        String password = loginDTO.getPassword();
        if(password==null || "".equals(password))
            return R.base(301,"密码不能为空");
        UserVO user = userService.getUserByAccountByPassword(loginDTO);
        if(user == null)
            return R.base(302,"用户名或者密码错误，请重新输入");
        return R.success().payLoad("user",user);
    }
    @RequestMapping(path = "/user/tmp",method = {RequestMethod.GET, RequestMethod.POST})
    public R  loginVisitors(@RequestBody Map<String,String> parameters){
        return R.success();
    }
}
