package com.thejianghuartist.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.thejianghuartist.mapper.UserMapper;
import com.thejianghuartist.pojo.User;
import com.thejianghuartist.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        Page<User> userPage = userMapper.selectPage(new Page<User>(1, 10), null);

        return userPage.getRecords();
    }
}
