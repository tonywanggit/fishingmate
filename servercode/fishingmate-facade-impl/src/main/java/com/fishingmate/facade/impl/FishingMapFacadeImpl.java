package com.fishingmate.facade.impl;

import com.fishingmate.domain.FishingMap;
import com.fishingmate.domain.Location;
import com.fishingmate.facade.FishingMapFacade;
import com.fishingmate.facade.common.BaseResponse;
import com.fishingmate.facade.enums.FishingMapEnum;
import com.fishingmate.facade.enums.FishingTypeEnum;
import com.fishingmate.facade.model.CreateFishingMapReq;
import com.fishingmate.repository.FishingMapRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/9/009.
 */
@Component("fishingMapFacade")
@Path("/api/fishingmap")
@Produces({"application/json; charset=UTF-8"})
public class FishingMapFacadeImpl implements FishingMapFacade {

    @Resource
    private FishingMapRepository fishingMapRepository;

    @POST
    @Override
    @Path("/create")
    public BaseResponse createFishingMap(CreateFishingMapReq req) {
        BaseResponse response = new BaseResponse();

        FishingMap fishingMap = new FishingMap();
        fishingMap.setUserId(req.getUserId());
        fishingMap.setFishingMapType(req.getFishingMapType().getCode());
        fishingMap.setFishingType(req.getFishingType().getCode());
        fishingMap.setCreateTime(new Date());
        fishingMap.setDesc(req.getDesc());

        Location location = new Location();
        location.setLongitude(req.getLongitude());
        location.setLatitude(req.getLatitude());
        fishingMap.setLocation(location);

        fishingMapRepository.createFishingMap(fishingMap);

        return response;
    }
}
