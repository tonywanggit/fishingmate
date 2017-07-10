package com.fishingmate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * 垂钓者（用户信息）
 * Created by wangxudong on 2017/7/10.
 */
@Document(collection = "Angler")
public class Angler {
    /**
     * 用户编号
     */
    @Id
    private int userId;

    /**
     * 登录手机号
     */
    @Field("mb")
    private String mobile;

    /**
     * 昵称
     */
    @Field("nn")
    private String nickName;

    /**
     * 头像地址
     */
    @Field("logo")
    private String logoUrl;

    /**
     * 第三方用户编号
     */
    @Field("tid")
    private String thirdUserId;

    /**
     * 第三方用户昵称
     */
    @Field("tnn")
    private String thirdNickName;

    /**
     * 创建时间
     */
    @Field("ct")
    private Date createTime;

    /**
     * 更新时间
     */
    @Field("ut")
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getThirdNickName() {
        return thirdNickName;
    }

    public void setThirdNickName(String thirdNickName) {
        this.thirdNickName = thirdNickName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
