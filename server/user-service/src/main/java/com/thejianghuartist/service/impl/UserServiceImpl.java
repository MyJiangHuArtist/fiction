package com.thejianghuartist.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.thejianghuartist.dto.UserLoginDTO;
import com.thejianghuartist.mapper.UserMapper;
import com.thejianghuartist.pojo.User;
import com.thejianghuartist.service.UserService;
import com.thejianghuartist.util.JWTUtil;
import com.thejianghuartist.vo.UserVO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Override
    public UserVO getUserByAccountByPassword(UserLoginDTO loginDTO) {
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
        if(loginDTO.getEmail() != null){
            query.eq(User::getEmail,loginDTO.getEmail());
        }else if(loginDTO.getPhone() != null){
            query.eq(User::getPhoneNumber,loginDTO.getPhone());
        }else if(loginDTO.getUsername() != null){
            query.eq(User::getUsername,loginDTO.getUsername());
        }
        query.eq(User::getPassword,loginDTO.getPassword()).eq(User::getStatus,1);

        User user = userMapper.getUserByAccountByPassword(query);
        if(user == null){
            return null;
        }
        String token= JWTUtil.generateToken(user.getDid());
        UserVO userVO = new UserVO(
                token,
                user.getUsername(),
                user.getAvatar()
        );
        return userVO;
    }


    @Override
    public List<User> getUsers() {
        Page<User> userPage = userMapper.selectPage(new Page<User>(1, 10), null);

        return userPage.getRecords();
    }
}
