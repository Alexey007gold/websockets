package com.alexkoveckiy.strategy.server.protocol;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public class Response<T extends ResponseData> extends Message<T> {

    private ResponseStatus status;

    public Response() {
    }

    public Response(MessageHeader header, T data, ResponseStatus status) {
        super(header, data);
        this.status = status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public ResponseStatus getStatus() {
        return status;
    }
}
