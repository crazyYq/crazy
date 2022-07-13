package cn.ekgc.crazy.system.admin.controller;

import cn.ekgc.crazy.base.controller.BaseController;
import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.base.pojo.vo.ResponseVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import cn.ekgc.crazy.system.admin.transport.IdentityTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>人员身份控制层类</b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
@RestController("identityController")
@RequestMapping("/system/admin/identity")
public class IdentityController extends BaseController {
	@Autowired
	private IdentityTransport identityTransport;

	/**
	 * <b>分页查询</b>
	 * @param pageNum
	 * @param pageSize
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO queryPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize,
								@RequestBody IdentityVO queryVO) throws Exception {
			// 创建查询分页视图
			QueryPageVO<IdentityVO> queryPageVO = new QueryPageVO<>(queryVO, pageNum, pageSize);
			// 进行分页查询，获得 PageVO 对象
			PageVO<IdentityVO> pageVO = identityTransport.getPage(queryPageVO);


			// 返回结果
			return ResponseVO.seccessResponseVO("查询成功", pageVO);

	}
}
