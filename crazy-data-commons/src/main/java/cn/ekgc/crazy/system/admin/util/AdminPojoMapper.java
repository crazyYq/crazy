package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Admin;
import cn.ekgc.crazy.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/14
 */
@Mapper
public interface AdminPojoMapper {
	IdentityPojoMapper INSTANCE = Mappers.getMapper(IdentityPojoMapper.class);

	/**
	 * <b>将视图转换为实体</b>
	 * @param vo
	 * @return
	 */
	public Admin parseToEntity(AdminVO vo);

	/**
	 * <b>将实体转为视图</b>
	 * @param entity
	 * @return
	 */
	public AdminVO parseToVO(Admin entity);

	/**
	 * <b>将视图列表转换为实体列表</b>
	 * @param voList
	 * @return
	 */
	public List<Admin> parseToEntityList(List<AdminVO> voList);

	/**
	 * <b>将实体列表转换为视图列表</b>
	 * @param entityList
	 * @return
	 */
	public List<AdminVO> parseToVOList(List<Admin> entityList);
}
