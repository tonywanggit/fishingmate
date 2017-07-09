package com.fishingmate.facade.common;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 请求基类
 * @author wangxudong
 *
 */
public class BaseRequest extends PrintFriendliness {

	/**
	 * 序列化版本
	 */
	private static final long serialVersionUID = 1995776180594622716L;
	
	/**
	 * 数据验证器
	 */
	private static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
	
	/**
	 * 请求Id
	 */
	private String requestId;
	/**
	 * 设备号
	 */
	private String deviceId;

	/**
	 * 签名
	 */
	private String sign;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * 验证数据有效性
	 */
	public void validate(){
		StringBuilder errorMsgs = new StringBuilder();
		Set<ConstraintViolation<BaseRequest>> violations = VALIDATOR.validate(this);
		
		if(violations != null && violations.size() > 0){
			for (ConstraintViolation<BaseRequest> violation : violations) {
				errorMsgs.append(violation.getMessage()).append("|");
			}
			throw new IllegalArgumentException(errorMsgs.substring(0, errorMsgs.length() - 1));
		}
	}
}
