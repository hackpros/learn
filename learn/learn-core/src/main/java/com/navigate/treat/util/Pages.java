package com.navigate.treat.util;

import java.util.List;

/**
 * 
 * @author rabbit
 * @date 2013-4-25 上午10:09:07
 * @email renntrabbit@foxmail.com
 * 
 * @param <T>
 */
public class Pages<T> implements java.io.Serializable {

	/**
	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
	 */

	private static final long serialVersionUID = 811560197992978164L;

	private int offset;
	private int length;

	private List<T> rows;

	private long total;

	public String getCurrUrl() {
		return currUrl;
	}

	public void setCurrUrl(String currUrl) {
		this.currUrl = currUrl;
	}

	private long totalPage;
	private String currUrl;

	public Pages(List<T> list, long total_,int offset_, int length_) {
		this.rows = list;
		this.total = total_;
		this.offset = offset_;
		this.length = length_;

		if (length_>=0){
			this.totalPage=1;
			return;
		}
		this.totalPage = total_ / length_;
		if (total_ % length_ > 0) {
			this.totalPage++;
		}

	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
}
