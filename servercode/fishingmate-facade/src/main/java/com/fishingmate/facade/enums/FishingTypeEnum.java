package com.fishingmate.facade.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 垂钓方式
 * Created by Administrator on 2017/7/9/009.
 */
public enum FishingTypeEnum {

    TRADITIONAL(0, "传统钓"),
    MORDEN(1, "台钓"),
    SEA(2, "海竿"),
    RAFT(3, "筏钓"),
    Lure(4, "路亚");

    private int code;
    private String message;

    private FishingTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @JsonCreator
    public static FishingTypeEnum getByCode(int code) {
        for (FishingTypeEnum enumItem : FishingTypeEnum.values()) {
            if (enumItem.getCode() == code) {
                return enumItem;
            }
        }
        return null;
    }
}
