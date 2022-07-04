package cn.ekgc.crazy.base.util;

import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtil {
	private static final String PAYLOAD_KEY = "payload";

	public  static  String createToken(Object value, Integer expireSec){
		//创建有效载荷对应的Map集合
		Map<String ,Object> payloadMap = new HashMap<String, Object>();
		payloadMap.put(PAYLOAD_KEY,value);
		Long expireMillis = System.currentTimeMillis()+expireSec * 1000;
		Date expirDate = new Date(expireMillis);
		payloadMap.put(JWT.EXPIRES_AT,expirDate);
		return JWTUtil.createToken(payloadMap, BaseConstants.TOKEN_KEY.getBytes());
	}

	/**
	 * <b>校验 Token 并获得对应有效载荷信息</b>
	 * @param token
	 * @return
	 */
	public static Object validateToken(String token) {
		if (StrUtil.isNotBlank(token) && JWTUtil.verify(token, BaseConstants.TOKEN_KEY.getBytes())) {
			// 此时 Token 存在，并且校验有效，解析 Token 获得对应的信息
			return JWTUtil.parseToken(token).getPayload(PAYLOAD_KEY);
		}
		return null;
	}


}
