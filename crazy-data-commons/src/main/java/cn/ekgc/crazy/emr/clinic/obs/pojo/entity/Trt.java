package cn.ekgc.crazy.emr.clinic.obs.pojo.entity;

import cn.ekgc.crazy.base.pojo.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("emr_obs_trt")
public class Trt extends BaseEntity {
	private static final long serialVersionUID = -3466485992072143433L;
	private Long id;                          //主键
	private String ermClinicObs;              //所属急诊留观病历
	private String trtProcName;               //诊疗过程名称
	private String trtProcDesc;               //诊疗过程描述

}
