package cn.ekgc.crazy.system.admin.pojo.vo;

import cn.ekgc.crazy.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/14
 */
@Data
public class MenuVO extends BaseVO {
	private static final long serialVersionUID = 7329940701182091411L;
	private Long id;					//主键
	private String parent;				//上级功能
	private String name;				//功能名称
	private String code;				//功能编码
	private String url;					//链接地址
	private String icon;				//图标
	private String order;				//顺序
}
