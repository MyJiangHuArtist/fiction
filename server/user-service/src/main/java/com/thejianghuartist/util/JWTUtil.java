package com.thejianghuartist.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class JWTUtil {
    private static final String TAG = "FICTION";
    public static String generateToken(Long userid) {
        return JWT.create()
                .withClaim("userid",userid)
                .sign(Algorithm.HMAC256(TAG));
    }
}
