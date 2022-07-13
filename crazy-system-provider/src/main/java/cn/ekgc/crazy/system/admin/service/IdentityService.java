package cn.ekgc.crazy.system.admin.service;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;

public interface IdentityService {
	PageVO<IdentityVO> getPage(IdentityVO queryVO, PageVO<IdentityVO> pageVO) throws Exception;
}
