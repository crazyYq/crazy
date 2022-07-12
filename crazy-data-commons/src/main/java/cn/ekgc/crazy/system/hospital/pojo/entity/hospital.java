package cn.ekgc.crazy.system.hospital.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_position")
public class hospital extends BaseEntity {
	private Long id;
	private String deptId;
	private String name;
	private String code;
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;}
