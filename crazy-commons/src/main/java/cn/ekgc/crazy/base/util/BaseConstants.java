package cn.ekgc.crazy.base.util;

import java.util.Properties;

public class BaseConstants {
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		}catch (Exception e){
			throw  new RuntimeException(e);
		}
	}
	/**
	 * 分页默认页码
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));

	/**
	 * 分页默认页数
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

	/**
	 * 统状态：启用状态
	 */
	public static final String STATUS_ENABLE = props.getProperty("status.enable");

	/**
	 * 系统状态：禁用状态
	 */
	public static final String STATUS_DISABLE = props.getProperty("status.disable");

	/**
	 * 系统响应码：系统业务处理完毕响应成功
	 */
	public static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("response.success"));

	/**
	 * 系统响应码：用户未进行系统认证
	 */
	public static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("response.unauth"));

	/**
	 * 系统响应码：系统业务处理错误
	 */
	public static final Integer RESPONSE_FAILURE = Integer.parseInt(props.getProperty("response.failure"));

	/**
	 * 系统响应码：系统业务响应异常
	 */
	public static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("response.exception"));

	/**
	 * token 信息：token 加密私钥
	 */
	public static final String TOKEN_KEY = props.getProperty("token.key");

	/**
	 * token 信息：token 有效时长
	 */
	public static final Integer TOKEN_EXPIRE = Integer.parseInt(props.getProperty("token.expire"));



}
