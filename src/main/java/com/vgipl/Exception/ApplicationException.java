/**
 * 
 */
package com.vgipl.Exception;

/**
 * @author Priyanka Kadukar
 *
 */
public class ApplicationException extends Exception {
	
	private int exceptionCode;
	private String exceptionMsg;
	
	public int getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(int exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	public ApplicationException(int exceptionCode, String exceptionMsg) {
		this.exceptionCode = exceptionCode;
		this.exceptionMsg = exceptionMsg;
	}
	
	public ApplicationException() {
		
	}
	
	
	

}
