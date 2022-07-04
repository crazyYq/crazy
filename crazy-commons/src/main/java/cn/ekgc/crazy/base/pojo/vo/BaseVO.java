package cn.ekgc.crazy.base.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseVO implements Serializable {
	private String staus;					//系统状态：Y-启用  N-禁用
	private String createdBy;				//创建人
	private Date createTime;				//创建时间
	private String modeifiedBy;				//修改人
	private Date modeifiedTime;				//修改时间
}
