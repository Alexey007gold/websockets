package com.alexkoveckiy.strategy.server.game.api.message;

import com.alexkoveckiy.strategy.server.game.api.dto.WorldDTO;
import com.alexkoveckiy.strategy.server.protocol.ResponseData;

import java.util.List;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public class GetWorldsListResponseData implements ResponseData {

    private List<WorldDTO> worlds;

    public GetWorldsListResponseData(List<WorldDTO> worlds) {
        this.worlds = worlds;
    }

    public List<WorldDTO> getWorlds() {
        return worlds;
    }
}
