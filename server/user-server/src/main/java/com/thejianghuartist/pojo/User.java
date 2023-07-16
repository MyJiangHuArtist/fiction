package com.thejianghuartist.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    @TableId
    private Long id;
    private Long uid;
    private String name;
    private String description;
    private String avatar;
    private Byte age;
    private String sex;
    private Integer type;
    private String password;
}
