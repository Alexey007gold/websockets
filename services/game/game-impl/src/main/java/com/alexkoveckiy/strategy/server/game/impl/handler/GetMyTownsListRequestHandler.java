package com.alexkoveckiy.strategy.server.game.impl.handler;

import com.alexkoveckiy.strategy.server.dao.entity.TownEntity;
import com.alexkoveckiy.strategy.server.dao.service.TownService;
import com.alexkoveckiy.strategy.server.game.api.dto.TownDTO;
import com.alexkoveckiy.strategy.server.game.api.handler.GameRequestHandler;
import com.alexkoveckiy.strategy.server.game.api.message.GetMyTownsListRequest;
import com.alexkoveckiy.strategy.server.game.api.message.GetMyTownsListResponse;
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
public class GetMyTownsListRequestHandler extends GameRequestHandler<GetMyTownsListRequest, GetMyTownsListResponse> {

    @Autowired
    private TownService townService;

    @Autowired
    private ModelMapperService modelMapperService;

    @Override
    public String getName() {
        return "get_my_towns_list";
    }


    @Override
    protected Response<GetMyTownsListResponse> process(Request<GetMyTownsListRequest> req) throws Exception {
        List<TownDTO> townDTOS = new ArrayList<>();
        for (TownEntity townEntity : townService.findByWorldIdAndOwnerId(req.getData().getWorldId(), req.getUserId())) {
            townDTOS.add(modelMapperService.map(townEntity, TownDTO.class));
        }
        return ResponseFactory.createResponse(req, new GetMyTownsListResponse(townDTOS));
    }
}
