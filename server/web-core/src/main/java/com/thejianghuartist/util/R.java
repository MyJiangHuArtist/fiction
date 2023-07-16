package com.thejianghuartist.util;

import java.util.HashMap;

/**
 * 返回主类
 */
public class R extends HashMap<String,Object> {
    /**
     * 封装构造
     * @param msg 返回信息
     * @param code 状态
     */
    private R(String msg,Integer code){
        this.put("msg",msg);
        this.put("code",code);
    }
    public static R base(String msg,Integer code){
        return new R(msg,code);
    }
    public static R base(REnum rEnum){
        return new R(rEnum.msg, rEnum.code);
    }

}
