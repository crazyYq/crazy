package cn.ekgc.crazy.emr.rx.wm.pojo.util;

import cn.ekgc.crazy.emr.rx.pojo.vo.PrescriptionVO;
import cn.ekgc.crazy.emr.rx.wm.pojo.entity.Prescription;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b>西医处方试图实体转换工具类</b>
 *
 * @author kennyS
 * @data 2022/7/14
 */
@Mapper
public interface PreScriptionPojoMapper {
	PreScriptionPojoMapper INSTANCE= Mappers.getMapper(PreScriptionPojoMapper.class);
	//视图转实体
	Prescription parseToEntity(PrescriptionVO vo);
	//实体转视图
	PrescriptionVO parseToVO(Prescription entity);
	//实体列表转视图列表
	List<PrescriptionVO> voList(List<Prescription> entityList);
}
