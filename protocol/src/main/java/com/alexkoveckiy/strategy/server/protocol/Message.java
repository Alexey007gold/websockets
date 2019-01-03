package com.alexkoveckiy.strategy.server.protocol;

import java.io.Serializable;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class Message<T extends Serializable> {

    private MessageHeader header;

    private T data;

    public Message() {
    }

    public Message(MessageHeader header) {
        this.header = header;
    }

    public Message(MessageHeader header, T data) {
        this.header = header;
        this.data = data;
    }

    public MessageHeader getHeader() {
        return header;
    }

    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
