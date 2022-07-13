package cn.ekgc.crazy.system.admin.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_admin")
public class Admin extends BaseEntity {
	private Long id;						//主键
	private String no;						//工号
	private String cellphone;				//手机号码
	private String password;				//登陆密码
	private String identity;				//身份信息
	private String position;				//人员职务
	private String department;				//所属部门科室
	private String idCard;					//身份证号码
	private String techTitle;				//专业技术职务
	private String eduBackground;			//学历
	private String status;					//系统状态，0-禁用，1-启用
}
