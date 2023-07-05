package com.thejianghuartist.util;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;

/**
 * 公共返回类，封装返回信息
 */
public final class R  extends HashMap<String,Object>{
    private R(Integer code,String message){
        super.put("code",code);
        super.put("message",message);
    }
    private R(){

    }

    /**
     * 错误请求返回
     * @return
     */
    public   static R error(){
        return new R(500,"未知异常，请联系管理员");
    }

    /**
     * 请求成功返回
     * @return
     */
    public static R success(){
        return new R(200,"请求成功");
    }

    /**
     * 手动设置请求返回码及信息
     * @param code
     * @param message
     * @return
     */
    public static R base(Integer code,String message){
        return new R(code,message);
    }
    public static R base(REnum rEnum){
        return new R(rEnum.getCode(), rEnum.getMessage());
    }

    /**
     * 获取空返回对象
     * @return
     */
    public static R empty(){
        return new R();
    }
    public R payLoad(String key,Object value){
        this.put(key,value);
        return this;
    }
    public R returnTime(){
        this.put("time",new Date());
        return this;
    }
}
