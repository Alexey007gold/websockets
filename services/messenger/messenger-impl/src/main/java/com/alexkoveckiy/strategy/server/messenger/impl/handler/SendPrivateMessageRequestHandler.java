package com.alexkoveckiy.strategy.server.messenger.impl.handler;

import com.alexkoveckiy.strategy.server.messenger.api.message.SendPrivateMessageRequestData;
import com.alexkoveckiy.strategy.server.messenger.api.message.SendPrivateMessageResponseData;
import com.alexkoveckiy.strategy.server.messenger.api.handler.MessengerRequestHandler;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class SendPrivateMessageRequestHandler extends MessengerRequestHandler<SendPrivateMessageRequestData, SendPrivateMessageResponseData> {
    @Override
    public String getName() {
        return "send_private_message";
    }

    @Override
    protected Response<SendPrivateMessageResponseData> process(Request<SendPrivateMessageRequestData> req) throws Exception {
        return null;
    }
}
