package cn.ekgc.crazy.base.pojo.enums;


import cn.ekgc.crazy.base.util.BaseConstants;

public enum ResponseEnum {
	RESPONSE_CODE_SUCCESS(BaseConstants.RESPONSE_SUCCESS,"系统业务响应成功"),
	RESPONSE_CODE_UNAUTH(BaseConstants.RESPONSE_UNAUTH,"用户未进行系统认证"),
	RESPONSE_CODE_FAILURE(BaseConstants.RESPONSE_FAILURE,"系统业务处理失败"),
	RESPONSE_CODE__EXCEPTION(BaseConstants.RESPONSE_EXCEPTION,"系统业务响应异常");
	private  Integer code;								//编码
	private String remark;								//说明

	private ResponseEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemake() {
		return remark;
	}

	public void setRemake(String remark) {
		this.remark = remark;
	}
}
