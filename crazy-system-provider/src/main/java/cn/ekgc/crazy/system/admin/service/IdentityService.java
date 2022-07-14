package cn.ekgc.crazy.system.admin.service;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;

import java.util.List;

public interface IdentityService {
	PageVO<IdentityVO> getPage(IdentityVO queryVO, PageVO<IdentityVO> pageVO) throws Exception;

	List<IdentityVO> getList(IdentityVO identityVO) throws Exception;

	IdentityVO getById(Long id) throws Exception;

	IdentityVO getByCode(String code) throws Exception;
}
