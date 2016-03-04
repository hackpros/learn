package org.learn.exception;

/**
 * 
 * @author fanwg
 * @date 2013-7-22 下午05:05:10
 * @email renntrabbit@foxmail.com
 */
public class AuthException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2757313109891806259L;

	public AuthException(String msg) {
		super(msg);
	}

	public interface ErrorMessageInfo {
		public final static String SIGN_INIT = "{'code':'10101','description':'签名错误'}";
		public static final String SIGN_ERROR = "签名殿堂";
		public static final String URL_OVERDUE = null;

	}

}
