package com.thejianghuartist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户标记控制器，进行登入，注册，
 */
@RestController
public class SignController {
    @RequestMapping(path="/sign")
    public String sign(){
        return "sign";
    }
}
