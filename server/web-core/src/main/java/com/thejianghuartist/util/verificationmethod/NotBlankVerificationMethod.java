package com.thejianghuartist.util.verificationmethod;

import com.thejianghuartist.annotaion.Validation;
import com.thejianghuartist.util.VerificationMethod;

public class NotBlankVerificationMethod implements VerificationMethod {

    public  boolean verify(Object value, Validation validation) {
        return false;
    }
}
