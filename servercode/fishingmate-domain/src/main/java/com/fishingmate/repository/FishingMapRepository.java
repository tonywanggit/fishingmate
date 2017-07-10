package com.fishingmate.repository;

import com.fishingmate.domain.FishingMap;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by wangxudong on 2017/7/10.
 */
@Component
public class FishingMapRepository {
    @Resource
    private MongoTemplate mongoTemplate;

    public void createFishingMap(FishingMap fishingMap){
        mongoTemplate.insert(fishingMap);
    }
}
