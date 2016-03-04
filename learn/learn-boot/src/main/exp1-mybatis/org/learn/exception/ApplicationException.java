package org.learn.exception;

public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2757313109891806259L;

	public ApplicationException(String msg) {
		super(msg);
	}

	public interface ErrorMessageInfo {
		
		String FTP_CONNECT_ERROR="连接ftp异常，可以导入无法上传对账文件..";
	}

}
