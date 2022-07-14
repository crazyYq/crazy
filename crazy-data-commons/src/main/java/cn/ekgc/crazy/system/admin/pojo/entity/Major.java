package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/14
 */
@Data
@TableName("sys_admin_major")
public class Major extends BaseEntity {
	private static final long serialVersionUID = 2244075991788366625L;
	private Long id;						//主键
	private String user;					//系统人员
	private String major;					//专业信息
}
