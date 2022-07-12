package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private Long id;
	private String parent;
	private String name;
	private String code;
	private String url;
	private String icon;
	private String order;
	private String status;
	private String createdBy;
	private Date createTime;
	private String modifiedBy;
	private Date modifiedTime;
}
