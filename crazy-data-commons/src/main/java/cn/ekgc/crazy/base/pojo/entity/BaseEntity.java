package cn.ekgc.crazy.base.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
	private String staus;					//系统状态：Y-启用  N-禁用
	@TableField("createdBy")
	private String createdBy;                   // 创建人
	@TableField("createTime")
	private Date createTime;                    // 创建时间
	@TableField("modifiedBy")
	private String modifiedBy;                  // 修改人
	@TableField("modifiedTime")
	private Date modifiedTime;                  // 修改时间
}
