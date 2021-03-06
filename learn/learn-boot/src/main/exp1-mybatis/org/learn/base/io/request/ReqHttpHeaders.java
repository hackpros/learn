package org.learn.base.io.request;

/**
 * 请求的头部
 * 
 * @author Administrator
 *
 */
public class ReqHttpHeaders {
	/**
	 * 签名
	 */
	private String sign;
	/*
	 * 时间戳
	 */
	private long stamp;

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public long getStamp() {
		return stamp;
	}

	public void setStamp(long stamp) {
		this.stamp = stamp;
	}

}
