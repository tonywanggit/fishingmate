package com.fishingmate.facade.model;

import com.fishingmate.facade.common.BaseRequest;
import com.fishingmate.facade.enums.FishingMapEnum;
import com.fishingmate.facade.enums.FishingTypeEnum;

/**
 * 创建渔情
 * Created by Administrator on 2017/7/9/009.
 */
public class CreateFishingMapReq extends BaseRequest {

    /**
     * 用户编号
     */
    private int userid;

    /**
     * 纬度
     */
    private double latitude;

    /**
     * 经度
     */
    private double longitude;

    /**
     * 渔情类型 ：0 - 放竿，1 - 渔货， 2 - 空军
     */
    private FishingMapEnum fishingMapType;

    /**
     * 垂钓方式
     */
    private FishingTypeEnum fishingType;

    /**
     * 描述
     */
    private String desc;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public FishingMapEnum getFishingMapType() {
        return fishingMapType;
    }

    public void setFishingMapType(FishingMapEnum fishingMapType) {
        this.fishingMapType = fishingMapType;
    }

    public FishingTypeEnum getFishingType() {
        return fishingType;
    }

    public void setFishingType(FishingTypeEnum fishingType) {
        this.fishingType = fishingType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
