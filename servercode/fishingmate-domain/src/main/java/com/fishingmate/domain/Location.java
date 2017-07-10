package com.fishingmate.domain;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 位置信息
 * Created by wangxudong on 2017/7/10.
 */
public class Location {
    /**
     * 经度
     */
    @Field("lon")
    private double longitude;

    /**
     * 纬度
     */
    @Field("lat")
    private double latitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
