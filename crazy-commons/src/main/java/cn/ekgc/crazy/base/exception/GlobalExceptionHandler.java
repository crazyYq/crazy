package cn.ekgc.crazy.base.exception;

import cn.ekgc.crazy.base.pojo.vo.ResponseVO;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * 系统异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	//获取Logger对象，用于记录日志
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>处理控制层所抛出的异常信息</b>
	 * @param exception
	 * @return
	 */
	@ExceptionHandler
	public ResponseVO globalExceptionHandler(Exception exception){
		logger.error(exception.getMessage()+" : " + new Date(),exception);
		return  ResponseVO.exceptionResponseVO(exception);
	}
}
