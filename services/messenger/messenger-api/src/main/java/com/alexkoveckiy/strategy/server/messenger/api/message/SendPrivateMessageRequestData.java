package com.alexkoveckiy.strategy.server.messenger.api.message;

import com.alexkoveckiy.strategy.server.protocol.RequestData;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public class SendPrivateMessageRequestData implements RequestData {

    private String receiverId;

    private String text;

    public SendPrivateMessageRequestData() {
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getText() {
        return text;
    }
}
