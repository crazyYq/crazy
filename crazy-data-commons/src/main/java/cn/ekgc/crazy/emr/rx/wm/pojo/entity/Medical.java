package cn.ekgc.crazy.emr.rx.wm.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_wm_rx_med")
public class Medical extends BaseEntity {
	private static final long serialVersionUID = -7147409342240117312L;
	private String id;                              //主键
	private String emrClinicRx;                     //门（急）诊西医处方
	private String medUsage;                        //药物用法
	private String usageRate;                       //药物使用-频率
	private String medUnit;                         //药物使用-剂量单位
	private String perDosage;                       //药物使用-次剂量
	private String totalDosage;                     //药物使用-总剂量
	private String wayCode;                         //药物使用-途径代码
	private String medName;                         //药物名称
	private String dosageForm;                      //药物剂型代码
	private String medCat;                          //药物类型
	private String medNameCode;                     //药物名称代码
}
