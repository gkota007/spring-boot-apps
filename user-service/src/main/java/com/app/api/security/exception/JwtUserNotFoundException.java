package com.app.api.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author Anish Panthi
 */
public class JwtUserNotFoundException extends AuthenticationException {

    /**
     * @param msg
     */
    public JwtUserNotFoundException(String msg) {
        super(msg);
    }
}
