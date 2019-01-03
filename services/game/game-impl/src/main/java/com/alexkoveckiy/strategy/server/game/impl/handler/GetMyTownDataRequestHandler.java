package com.alexkoveckiy.strategy.server.game.impl.handler;

import com.alexkoveckiy.strategy.server.game.api.handler.GameRequestHandler;
import com.alexkoveckiy.strategy.server.game.api.message.GetMyTownDataRequest;
import com.alexkoveckiy.strategy.server.game.api.message.GetMyTownDataResponse;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class GetMyTownDataRequestHandler extends GameRequestHandler<GetMyTownDataRequest, GetMyTownDataResponse> {
    @Override
    public String getName() {
        return "get_my_town_data";
    }


    @Override
    protected Response<GetMyTownDataResponse> process(Request<GetMyTownDataRequest> req) throws Exception {
        return null;
    }
}
