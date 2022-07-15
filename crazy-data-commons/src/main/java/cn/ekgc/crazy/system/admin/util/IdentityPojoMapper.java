package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Identity;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface IdentityPojoMapper {
	IdentityPojoMapper INSTANCE = Mappers.getMapper(IdentityPojoMapper.class);

	/**
	 * <b>将视图转换为实体</b>
	 * @param vo
	 * @return
	 */
	public Identity parseToEntity(IdentityVO vo);

	/**
	 * <b>将实体转为视图</b>
	 * @param entity
	 * @return
	 */
	public IdentityVO parseToVO(Identity entity);

	/**
	 * <b>将视图列表转换为实体列表</b>
	 * @param voList
	 * @return
	 */
	public List<Identity> parseToEntityList(List<IdentityVO> voList);

	/**
	 * <b>将实体列表转换为视图列表</b>
	 * @param entityList
	 * @return
	 */
	public List<IdentityVO> parseToVOList(List<Identity> entityList);
}
