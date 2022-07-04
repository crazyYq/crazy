package cn.ekgc.crazy.base.pojo.vo;

import cn.ekgc.crazy.base.pojo.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseVO<E>  implements Serializable {
	private Integer code;                       // 系统响应编码
	private String message;                     // 系统响应信息
	private E data;                             // 系统响应数据

	public  ResponseVO(ResponseEnum responseEnum , String message,E data){
		this.code = responseEnum.getCode();
		this.message = message;
		this.data = data;
	}

	/**
	 * 获得系统业务处理成功
	 * @param message
	 * @return
	 */
	public static ResponseVO seccessResponseVO(String message){
		 return  new ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS,message,"");
	}

	/**
	 * 获得系统业务处理成功
	 * @param message
	 * @return
	 */
	public static ResponseVO seccessResponseVO(String message,Object data){
		return  new ResponseVO(ResponseEnum.RESPONSE_CODE_SUCCESS,message,data);
	}

	/**
	 * <b>获得用户未进行系统认证视图信息</b>
	 * @return
	 */
	public static ResponseVO unAuthResponseVO() {
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_UNAUTH, ResponseEnum.RESPONSE_CODE_UNAUTH.getRemake(),"");
	}

	/**
	 * 获得系统业务处理错误视图信息
	 * @param message
	 * @return
	 */
	public  static ResponseVO failureResponseVO(String message){
		return new ResponseVO(ResponseEnum.RESPONSE_CODE_FAILURE,message,"");
	}

	/**
	 * 获得系统业响应异常视图信息
	 * @param e
	 * @return
	 */
	public static ResponseVO exceptionResponseVO(Exception e){
		return  new ResponseVO(ResponseEnum.RESPONSE_CODE__EXCEPTION,e.getMessage(),e);
	}

}
