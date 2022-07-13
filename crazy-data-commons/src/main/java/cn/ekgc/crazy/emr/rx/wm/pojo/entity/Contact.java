package cn.ekgc.crazy.emr.rx.wm.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("emr_wm_rx_contact")
public class Contact extends BaseEntity {
	private static final long serialVersionUID = -1782299421721995779L;
	private String id;                                  //主键
	private String emrClinicRx;                         //门（急）诊西医处方
	private String markCatCode;                         //标识号-类别代码
	private String markNo;                              //标识号-号码
	private Date markEffDate;                           //标识号-生效日期
	private String markOrgName;                         //标识号-提供标识的机构名称
	private String markObj;                             //姓名-标识对象
	private String markObjCode;                         //姓名-标识对象代码
	private String name;                                //姓名
}
