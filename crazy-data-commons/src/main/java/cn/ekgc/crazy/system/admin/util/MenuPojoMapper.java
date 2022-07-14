package cn.ekgc.crazy.system.admin.util;

import cn.ekgc.crazy.system.admin.pojo.entity.Menu;
import cn.ekgc.crazy.system.admin.pojo.vo.MenuVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MenuPojoMapper {
	IdentityPojoMapper INSTANCE = Mappers.getMapper(IdentityPojoMapper.class);

	/**
	 * <b>将视图转换为实体</b>
	 * @param vo
	 * @return
	 */
	public Menu parseToEntity(MenuVO vo);

	/**
	 * <b>将实体转为视图</b>
	 * @param entity
	 * @return
	 */
	public MenuVO parseToVO(Menu entity);

	/**
	 * <b>将视图列表转换为实体列表</b>
	 * @param voList
	 * @return
	 */
	public List<Menu> parseToEntityList(List<MenuVO> voList);

	/**
	 * <b>将实体列表转换为视图列表</b>
	 * @param entityList
	 * @return
	 */
	public List<MenuVO> parseToVOList(List<Menu> entityList);
}
