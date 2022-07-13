package cn.ekgc.crazy.system.admin.transport.impl;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.admin.service.IdentityService;
import cn.ekgc.crazy.system.admin.transport.IdentityTransport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
@RestController("identityTransport")
@RequestMapping("/system/admin/identity/trans")
public class IdentityTransportImpl implements IdentityTransport {
	@Resource(name = "identityService")
	private IdentityService identityService;
	@Override
	public PageVO<IdentityVO> getPage(QueryPageVO<IdentityVO> queryPageVO) throws Exception {
		IdentityVO queryVO = queryPageVO.getQueryVO();
		PageVO<IdentityVO> pageVO = queryPageVO.getPageVO();
		return identityService.getPage(queryVO, pageVO);
	}
}
