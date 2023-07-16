package com.thejianghuartist.util;

import com.thejianghuartist.annotaion.Validation;

public interface VerificationMethod {
    static boolean verify(Object value, Validation validation) {
        return false;
    }
}
