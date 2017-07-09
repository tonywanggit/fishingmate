package com.fishingmate.facade.impl;

import com.fishingmate.facade.FishingMapFacade;
import com.fishingmate.facade.common.BaseResponse;
import com.fishingmate.facade.model.CreateFishingMapReq;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Administrator on 2017/7/9/009.
 */
@Component("fishingMapFacade")
@Path("/api/fishingmap")
@Produces({"application/json; charset=UTF-8"})
public class FishingMapFacadeImpl implements FishingMapFacade {

    @POST
    @Override
    @Path("/create")
    public BaseResponse createFishingMap(CreateFishingMapReq req) {
        BaseResponse response = new BaseResponse();

        return response;
    }
}
