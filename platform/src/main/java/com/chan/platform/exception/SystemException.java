package com.chan.platform.exception;

/**
 * 系统级异常
 * @author: Chan
 * @since : 2015-4-25
 */
public class SystemException extends Exception{
	  private static final long serialVersionUID = 1L;
	  
	/**
	 * @author: Chan
	 * @category errorCode 错误代码
	 * @since: 2015-4-25
	 */
	private String errorCode;

	  public SystemException(String errorCode)
	  {
	    this.errorCode = errorCode;
	  }

	  public SystemException(Throwable throwable) {
	    super(throwable);
	  }

	  public SystemException(String errorCode, Throwable throwable) {
	    super(throwable);
	    this.errorCode = errorCode;
	  }

	  public String getErrorCode() {
	    return this.errorCode;
	  }

	  public void setErrorCode(String errorCode) {
	    this.errorCode = errorCode;
	  }
}
