package cn.ekgc.crazy.system.admin.service.impl;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.system.admin.dao.IdentityDao;
import cn.ekgc.crazy.system.admin.pojo.entity.Identity;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.admin.service.IdentityService;
import cn.ekgc.crazy.system.admin.util.IdentityPojoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
@Service("identityService")
@Transactional
public class IdentityServiceImpl implements IdentityService {

	@Autowired
	private IdentityDao identityDao;

	@Override
	public PageVO<IdentityVO> getPage(IdentityVO queryVO, PageVO<IdentityVO> pageVO) throws Exception {
		// 将查询视图转换为查询实体
		System.out.println(pageVO.getPageNum()+"  "+pageVO.getPageSize()+" "+queryVO.getName() );
		Identity query = IdentityPojoMapper.INSTANCE.parseToEntity(queryVO);
		// 创建 MyBatisPlus 查询对象
		QueryWrapper<Identity> queryWrapper = new QueryWrapper<Identity>(query);

		// 开启 PageHelper 分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		// 进行列表查询
		List<Identity> entityList = identityDao.selectList(queryWrapper);

		// 根据分页列表创建 PageInfo 对象
		PageInfo<Identity> pageInfo = new PageInfo<Identity>(entityList);

		// 提取数据
		pageVO.setList(IdentityPojoMapper.INSTANCE.parseToVOList(pageInfo.getList()));
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());

		return pageVO;
	}

	@Override
	public List<IdentityVO> getList(IdentityVO identityVO) throws Exception {
		//试图转实体
		Identity identity=IdentityPojoMapper.INSTANCE.parseToEntity(identityVO);
		//创建MyBatis查询对象
		QueryWrapper<Identity> queryWrapper=new QueryWrapper<Identity>(identity);
		//列表查询
		List<Identity> identityList=identityDao.selectList(queryWrapper);
		return IdentityPojoMapper.INSTANCE.parseToVOList(identityList);
	}

	@Override
	public IdentityVO getById(Long id) throws Exception {
		//根据id查询实体
		Identity identity=identityDao.selectById(id);
		return IdentityPojoMapper.INSTANCE.parseToVO(identity);
	}

	@Override
	public IdentityVO getByCode(String code) throws Exception {
		//创建queryWapper查询对象
		QueryWrapper<Identity> queryWrapper=new QueryWrapper<Identity>();
		queryWrapper.eq("code",code);
		//查询实体
		Identity identity=identityDao.selectOne(queryWrapper);
		return IdentityPojoMapper.INSTANCE.parseToVO(identity);
	}
}
