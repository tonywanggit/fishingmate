package com.fishingmate.facade;

import com.fishingmate.facade.common.BaseResponse;
import com.fishingmate.facade.model.CreateFishingMapReq;

/**
 * 渔情接口
 * Created by Administrator on 2017/7/9/009.
 */
public interface FishingMapFacade {
    /**
     * 创建渔情
     * @param req
     * @return
     */
    BaseResponse createFishingMap(CreateFishingMapReq req);


}
