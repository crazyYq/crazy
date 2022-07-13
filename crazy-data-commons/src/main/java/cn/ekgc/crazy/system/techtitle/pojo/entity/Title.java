package cn.ekgc.crazy.system.techtitle.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *专业技术职务（职称）信息表
 */
@Data
@TableName("sys_tech-title")
public class Title extends BaseEntity {
	private Long id;					//主键
	private String type;				//所属类别
	private String grade;				//等级
	private String name;				//职务名称
	private String code;				//职务编码
}
