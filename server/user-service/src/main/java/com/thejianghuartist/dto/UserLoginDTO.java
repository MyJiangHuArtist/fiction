package com.thejianghuartist.dto;

import lombok.Data;

@Data
public class UserLoginDTO {

    private String username;
    private String email;

    private Long phone;
    private String password;
}
