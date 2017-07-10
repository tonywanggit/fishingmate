package com.fishingmate.domain;

import com.fishingmate.facade.common.PrintFriendliness;
import com.fishingmate.facade.enums.FishingMapEnum;
import com.fishingmate.facade.enums.FishingTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * 渔情
 * Created by wangxudong on 2017/7/10.
 */
@Document(collection = "FishingMap")
public class FishingMap extends PrintFriendliness {

    /**
     * 主键编号
     */
    @Id
    private String id;

    /**
     * 用户编号
     */
    @Field("uid")
    private int userId;

    /**
     * 位置信息
     */
    @Field("loc")
    private Location location;

    /**
     * 渔情类型 ：0 - 放竿，1 - 渔货， 2 - 空军
     * @see FishingMapEnum
     */
    @Field("mt")
    private int fishingMapType;

    /**
     * 垂钓方式
     * @see FishingTypeEnum
     */
    @Field("ft")
    private int fishingType;

    /**
     * 描述
     */
    @Field("desc")
    private String desc;

    /**
     * 创建时间
     */
    @Field("ct")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getFishingMapType() {
        return fishingMapType;
    }

    public void setFishingMapType(int fishingMapType) {
        this.fishingMapType = fishingMapType;
    }

    public int getFishingType() {
        return fishingType;
    }

    public void setFishingType(int fishingType) {
        this.fishingType = fishingType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
