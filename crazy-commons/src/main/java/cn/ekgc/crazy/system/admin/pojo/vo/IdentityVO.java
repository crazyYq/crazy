package cn.ekgc.crazy.system.admin.pojo.vo;

import cn.ekgc.crazy.base.pojo.vo.BaseVO;

import javax.validation.constraints.NotBlank;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = -5168885725391716506L;
	private Long id;                        // 主键
	@NotBlank
	private String code;                    // 身份编号
	@NotBlank
	private String name;                    // 身份名称
}
