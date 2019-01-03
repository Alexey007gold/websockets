package com.alexkoveckiy.strategy.server.authorization.api.message;

import com.alexkoveckiy.strategy.server.protocol.ResponseData;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
public class AuthorizationResponseData implements ResponseData {

    private String userId;

    public AuthorizationResponseData(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
