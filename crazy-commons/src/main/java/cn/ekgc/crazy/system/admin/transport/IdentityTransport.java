package cn.ekgc.crazy.system.admin.transport;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "crazy-system-provider")
public interface IdentityTransport {
	@PostMapping("/system/admin/identity/trans/page")
	PageVO<IdentityVO> getPage(QueryPageVO<IdentityVO> queryPageVO)throws Exception;
}
