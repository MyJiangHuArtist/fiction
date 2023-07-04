package com.thejianghuartist.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@TableName("user")
@Data
public class User {
    @TableId
    private Long did;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "did=" + did +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
