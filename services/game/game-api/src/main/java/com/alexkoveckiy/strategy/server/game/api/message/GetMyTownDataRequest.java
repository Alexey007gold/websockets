package com.alexkoveckiy.strategy.server.game.api.message;

import com.alexkoveckiy.strategy.server.protocol.RequestData;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public class GetMyTownDataRequest implements RequestData {

    private String worldId;

    private String townId;

    public GetMyTownDataRequest() {
    }

    public String getWorldId() {
        return worldId;
    }

    public String getTownId() {
        return townId;
    }
}
