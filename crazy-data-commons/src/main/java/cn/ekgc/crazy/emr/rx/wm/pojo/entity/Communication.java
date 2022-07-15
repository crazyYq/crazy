package cn.ekgc.crazy.emr.rx.wm.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("emr_wm_rx_comm")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = 86726025656456322L;
	private String id;                              //主键
	private String emrClinicRx;                     //门（急）诊西医处方
	private String phoneCat;                        //联系电话-类别
	private String phoneCatCode;                    //联系电话-类别代码
	private String phoneNo;                         //联系电话-号码
	private String email;                           //电子邮件地址
}
