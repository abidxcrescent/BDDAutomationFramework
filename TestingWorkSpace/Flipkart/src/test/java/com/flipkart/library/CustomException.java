package com.flipkart.library;

/*
 * This class is child class of Exception class and use to handle custom exceptions
 */

public class CustomException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * This method handle Objects of any type
	 */
	public CustomException (Object obj) {
		Log.error(obj.toString());
	}
	
	/*
	 * This method is to log error specific to strings
	 */
	public CustomException (String errorName) {
		super(errorName);
		Log.error(errorName);
	}
	
}
