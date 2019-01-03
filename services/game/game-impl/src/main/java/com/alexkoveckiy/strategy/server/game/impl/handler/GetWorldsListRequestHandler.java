package com.alexkoveckiy.strategy.server.game.impl.handler;

import com.alexkoveckiy.strategy.server.dao.entity.WorldEntity;
import com.alexkoveckiy.strategy.server.dao.service.WorldService;
import com.alexkoveckiy.strategy.server.game.api.dto.WorldDTO;
import com.alexkoveckiy.strategy.server.game.api.handler.GameRequestHandler;
import com.alexkoveckiy.strategy.server.game.api.message.GetWorldsListRequestData;
import com.alexkoveckiy.strategy.server.game.api.message.GetWorldsListResponseData;
import com.alexkoveckiy.strategy.server.modelmapper.ModelMapperService;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import com.alexkoveckiy.strategy.server.protocol.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class GetWorldsListRequestHandler extends GameRequestHandler<GetWorldsListRequestData, GetWorldsListResponseData> {

    @Autowired
    private WorldService worldService;

    @Autowired
    private ModelMapperService modelMapperService;

    @Override
    public String getName() {
        return "get_worlds_list";
    }


    @Override
    protected Response<GetWorldsListResponseData> process(Request<GetWorldsListRequestData> req) throws Exception {
        List<WorldDTO> worldDTOS = new ArrayList<>();

        for (WorldEntity worldEntity : worldService.findAll()) {
            worldDTOS.add(modelMapperService.map(worldEntity, WorldDTO.class));
        }
        return ResponseFactory.createResponse(req, new GetWorldsListResponseData(worldDTOS));
    }
}
