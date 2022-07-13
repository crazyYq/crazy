package cn.ekgc.crazy.system.admin.transport;

import cn.ekgc.crazy.base.pojo.vo.PageVO;
import cn.ekgc.crazy.base.pojo.vo.QueryPageVO;
import cn.ekgc.crazy.system.admin.pojo.vo.IdentityVO;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "crazy-system-provider")
public interface IdentityTransport {
	PageVO<IdentityVO> getPage(QueryPageVO<IdentityVO> queryPageVO)throws Exception;
}
