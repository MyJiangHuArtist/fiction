package com.thejianghuartist.service;

import com.thejianghuartist.dto.UserLoginDTO;
import com.thejianghuartist.pojo.User;
import com.thejianghuartist.vo.UserVO;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    UserVO getUserByAccountByPassword(UserLoginDTO loginDTO);
}
