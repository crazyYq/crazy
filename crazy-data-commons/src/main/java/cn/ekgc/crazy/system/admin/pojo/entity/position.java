package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_position")
public class position extends BaseEntity {
	private Long id;
	private String name;
	private String orgCode;
	private String leaderName;
	private String province;
	private String city;
	private String county;
	private String address;
	private String cellphone;
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;
}
