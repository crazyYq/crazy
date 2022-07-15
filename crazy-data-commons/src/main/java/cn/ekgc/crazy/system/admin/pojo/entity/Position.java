package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 人员职务信息表
 */
@Data
@TableName("sys_position")
public class Position extends BaseEntity {
	private static final long serialVersionUID = 5021988298444087255L;
	private Long id;						//主键
	private String deptId;					//所属部门
	private String name;					//职务名称
	private String code;					//职务编号
}
