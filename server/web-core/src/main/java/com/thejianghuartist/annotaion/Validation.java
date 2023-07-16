package com.thejianghuartist.annotaion;

import com.thejianghuartist.util.verificationmethod.NotBlankVerificationMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Validation {
    int value() ;  //注解序号
    Class<NotBlankVerificationMethod> method();
}
