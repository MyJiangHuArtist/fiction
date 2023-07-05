package com.thejianghuartist.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@TableName("user")
@Data
@Alias("user")
public class User {
    @TableId
    private Long did; //数据库id自增
    private String username;//用户名
    private String password;//密码
    private Long phoneNumber;//电话号码
    private String email;//邮箱
    private String avatar;//头像url
    private Integer sex;//性别
    private Integer age;//年龄
    private String address;//地址
    private Integer status;//状态
    private Date createTime;//创建时间


}
