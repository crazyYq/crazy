package cn.ekgc.crazy.emr.clinic.clinic.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("emr_clinic_advice")
public class Advice extends BaseEntity {
	private Long id;                               //主键
	private String emrClinic;                      //所属门（急）诊病历
	private Date startDate;                        //医嘱开嘱日期时间
	private Date stopDate;                         //长期医嘱停嘱日期时间
	private Date execDate;                        //医嘱执行日期时间
	private String execDateCatCode;               //医嘱执行时间类别代码
	private Date execCnlDate;                     //医嘱取消日期时间
	private String adviceCat;                     //医嘱类别
	private String adviceDetail;                  //医嘱内容

}
