package com.thejianghuartist.util;

public enum REnum {
    ERROR(200,"成功"),
    SUCCESS(500,"失败"),
    PARAMETER_IS_INVALID(400,"参数不合法");
    REnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    private final Integer code;
    private final String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
