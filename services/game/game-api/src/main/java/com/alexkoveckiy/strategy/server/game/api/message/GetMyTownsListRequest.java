package com.alexkoveckiy.strategy.server.game.api.message;

import com.alexkoveckiy.strategy.server.protocol.RequestData;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public class GetMyTownsListRequest implements RequestData {

    private String worldId;

    public GetMyTownsListRequest() {
    }

    public String getWorldId() {
        return worldId;
    }
}
