package cn.ekgc.crazy.system.admin.pojo.vo;

import cn.ekgc.crazy.base.pojo.vo.BaseVO;

/**
 * <b></b>
 *
 * @author crazy
 */
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = -4092656287329939401L;
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
}
