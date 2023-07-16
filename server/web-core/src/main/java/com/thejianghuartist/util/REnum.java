package com.thejianghuartist.util;

public enum REnum {
    SUCCESS("成功",200),
    FAIL("失败",500),
    PARAMETER_ERROR("参数校验错误",306);
    REnum(String msg, Integer code){
        this.msg = msg;
        this.code = code;
    }
    final String msg;
    final Integer code;

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}
