package com.alexkoveckiy.strategy.server.protocol;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public class Request<T extends RequestData> extends Message<T> {

    private String userId;

    public Request() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
