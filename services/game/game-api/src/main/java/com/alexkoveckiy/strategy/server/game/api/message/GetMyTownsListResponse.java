package com.alexkoveckiy.strategy.server.game.api.message;

import com.alexkoveckiy.strategy.server.game.api.dto.TownDTO;
import com.alexkoveckiy.strategy.server.protocol.ResponseData;

import java.util.List;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public class GetMyTownsListResponse implements ResponseData {

    private List<TownDTO> towns;

    public GetMyTownsListResponse(List<TownDTO> towns) {
        this.towns = towns;
    }
}
