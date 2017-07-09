package com.fishingmate.facade.common;


/**
 * 响应基类. <em>其所有子类必须有默认的构造函数</em>
 * 
 * @author tony
 *
 */
public class BaseResponse extends PrintFriendliness {

    private static final long serialVersionUID = -5719901720924490738L;

    private int code;

    private String message;

    private PrintFriendliness data;

    public PrintFriendliness getData() {
        return data;
    }

    public void setData(PrintFriendliness data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 默认构造成功的响应
     */
    public BaseResponse() {
        this.setCode(ResponseCode.SUCCESS.getCode());
    }

    public static BaseResponse newFailInstance(ResponseCode errorCode) {
        BaseResponse result = new BaseResponse();
        result.setCode(errorCode.getCode());
        result.setMessage(errorCode.getMessage());
        return result;
    }
}
