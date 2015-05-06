package com.chan.platform.exception;

/**
 * 定义基础异常
 * @author: Chan
 * @since : 2015-4-25
 */
public class VapBaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public VapBaseException(){
		
	}
	
	public VapBaseException(String message){
		super(message);
	}
	
	public VapBaseException(Throwable cause){
		super(cause);
	}
	
	public VapBaseException(String message, Throwable cause){
	    super(message, cause);
	}
}
