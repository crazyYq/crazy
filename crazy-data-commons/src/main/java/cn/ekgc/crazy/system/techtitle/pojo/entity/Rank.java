package cn.ekgc.crazy.system.techtitle.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *专业技术职务（职称）等级信息表
 */
@Data
@TableName("sys_tech_rank")
public class Rank extends BaseEntity {
	private static final long serialVersionUID = -344979968374975874L;
	private Long id;					//主键
	private String code;				//等级编码
	private String name;				//等级名称

}
