package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private Long id;
	private String no;
	private String cellphone;
	private String password;
	private String identity;
	private String position;
	private String department;
	private String idCard;
	private String techTitle;
	private String eduBackground;
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;
}
