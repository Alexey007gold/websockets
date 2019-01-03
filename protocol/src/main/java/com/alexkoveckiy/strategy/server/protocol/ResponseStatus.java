package com.alexkoveckiy.strategy.server.protocol;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public class ResponseStatus {

    private Integer code;

    private String message;

    public ResponseStatus() {
    }

    public ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
