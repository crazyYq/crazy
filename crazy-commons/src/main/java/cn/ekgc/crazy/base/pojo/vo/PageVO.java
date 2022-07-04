package cn.ekgc.crazy.base.pojo.vo;

import cn.ekgc.crazy.base.util.BaseConstants;

import java.util.List;

public class PageVO <E extends BaseVO>{
	private Integer pageNum;				//当前页码
	private Integer pageSize;				//分页数量
	private List<E> list;					//分页列表
	private Long totalCount;				//总条数
	private Integer totalPage;				//总页数

	public PageVO(){

	}
	public  PageVO(Integer pageNum,Integer pageSize){
		if (pageNum!=null && pageNum>0 ){
			this.pageNum = pageNum;
		}else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}
		if (pageSize!=null && pageSize > 0){
			this.pageSize = pageSize;
		}else{
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

}
