package com.thejianghuartist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.thejianghuartist.pojo.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
