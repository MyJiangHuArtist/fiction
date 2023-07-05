package com.thejianghuartist.vo;

import lombok.Data;

@Data
public class UserVO {
    private String token;
    private String username;
    private String avatar;
    public UserVO(String token, String username, String avatar){
        this.token = token;
        this.username = username;
        this.avatar = avatar;
    }

}
