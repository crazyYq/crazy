package cn.ekgc.crazy.system.techtitle.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *专业技术职务（职称）类别信息表
 */
@Data
@TableName("sys_tech_category")
public class Category extends BaseEntity {
	private static final long serialVersionUID = -5335469253322549221L;
	private Long id;					//主键
	private String code;				//类别编码
	private String name;				//类别名称
}
