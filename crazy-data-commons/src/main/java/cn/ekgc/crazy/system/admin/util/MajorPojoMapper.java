package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Major;
import cn.ekgc.crazy.system.admin.pojo.vo.MajorVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MajorPojoMapper {
	IdentityPojoMapper INSTANCE = Mappers.getMapper(IdentityPojoMapper.class);

	/**
	 * <b>将视图转换为实体</b>
	 * @param vo
	 * @return
	 */
	public Major parseToEntity(MajorVO vo);

	/**
	 * <b>将实体转为视图</b>
	 * @param entity
	 * @return
	 */
	public MajorVO parseToVO(Major entity);

	/**
	 * <b>将视图列表转换为实体列表</b>
	 * @param voList
	 * @return
	 */
	public List<Major> parseToEntityList(List<MajorVO> voList);

	/**
	 * <b>将实体列表转换为视图列表</b>
	 * @param entityList
	 * @return
	 */
	public List<MajorVO> parseToVOList(List<Major> entityList);
}
