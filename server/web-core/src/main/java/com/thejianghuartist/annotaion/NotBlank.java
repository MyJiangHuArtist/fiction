package com.thejianghuartist.annotaion;

import com.thejianghuartist.util.verificationmethod.NotBlankVerificationMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME )
@Target(ElementType.FIELD)
@Validation(value = -1,method = NotBlankVerificationMethod.class)
public @interface NotBlank {
    String value() default "" ;
}
