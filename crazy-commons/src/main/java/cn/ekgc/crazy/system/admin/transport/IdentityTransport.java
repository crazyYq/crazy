package cn.ekgc.crazy.system.admin.transport;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "crazy-system-provider")
public interface IdentityTransport {
	@PostMapping("/system/admin/identity/trans/page")
	PageVO<IdentityVO> getPage(@RequestBody QueryPageVO<IdentityVO> queryPageVO)throws Exception;

	@PostMapping("/system/admin/identity/trans/list")
	List<IdentityVO> getList(@RequestBody IdentityVO identityVO) throws Exception;

	@PostMapping("/system/admin/identity/trans/id")
	IdentityVO getById(@RequestParam Long id) throws Exception;

	@PostMapping("/system/admin/identity/trans/code")
	IdentityVO getByCode(String code) throws Exception;
}
