package com.fishingmate.facade.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 渔情类型
 * Created by Administrator on 2017/7/9/009.
 */
public enum FishingMapEnum {
    FISHING_START(0, "放竿"),

    FISING_RESULT(1, "渔货"),

    FISHING_NONE(2, "空军");

    private int code;

    private String message;

    private FishingMapEnum(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode(){
        return  this.code;
    }

    @JsonCreator
    public static FishingMapEnum getByCode(int code) {
        for (FishingMapEnum enumItem : FishingMapEnum.values()) {
            if (enumItem.getCode() == code) {
                return enumItem;
            }
        }
        return null;
    }
}
