package cn.ekgc.crazy.emr.rx.wm.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_wm_rx_ins")
public class Insurance extends BaseEntity {
	private static final long serialVersionUID = 729886097865715064L;
	private String id;                                  //主键
	private String emrClinicRx;                         //门（急）诊西医处方
	private String insCat;                              //医疗保险-类别
	private String insCatCode;                          //医疗保险-类别代码
}
