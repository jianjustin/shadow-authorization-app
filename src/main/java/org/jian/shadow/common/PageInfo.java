package org.jian.shadow.common;

/**
 * 分页参数
 * @author jian
 */
public class PageInfo {
	
	private int offset;
	
	private int limit;
	
	private int numberperpage;
	
	private int pagenumber;
	
	private int totalCount;

	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getNumberperpage() {
		return numberperpage;
	}
	public void setNumberperpage(int numberperpage) {
		this.limit = numberperpage;//设置数据层的分页参数
		this.numberperpage = numberperpage;
	}
	public int getPagenumber() {
		return pagenumber;
	}
	public void setPagenumber(int pagenumber) {
		this.offset =(pagenumber-1)*numberperpage;//设置数据层的分页参数
		this.pagenumber = pagenumber;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
