package com.thejianghuartist.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 参数校验
 */
public class Validation {
    private static final Map<Class<?>,ObjectParameterEntry[]> VALIDATION_KEYS = new HashMap<>();
//    public static boolean validateParameter(Object obj){

//        Class<?> oc = obj.getClass();
//        //获得全部属性包括受保护的
//        Field[] declaredFields = oc.getDeclaredFields();
//
//    }
    public  Map<Class<?>,ObjectParameterEntry[]> parseObjectParameterEntry(Class<?> clazz)   {
        Field[] dfs = clazz.getDeclaredFields();
        if(0 == dfs.length) {
            return null;
        }
        List<ObjectParameterEntry> entries = new ArrayList<>();
        for (Field f : dfs) {
            com.thejianghuartist.annotaion.Validation[] annotationsByType = f.getAnnotationsByType(com.thejianghuartist.annotaion.Validation.class);
            if(0 == annotationsByType.length) continue;
            for( com.thejianghuartist.annotaion.Validation a : annotationsByType){
                a.value();
            }
        }
        return null;
    }

    record ObjectParameterEntry(String paramName, Validation[] annotations, Field self) {

    }


}
