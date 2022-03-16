package com.flipkart.library;

import org.apache.log4j.Logger;

public class Log {
	/*
	 * Initializing Log4j logs              
	*/
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	/*
	 * This is to print log for the beginning of the test case, as we usually 
	 * run to many test cases as a test suite
	 */
	
	public static void startOfTestCase(String startTestCaseName) {
		Log.info("------------------------------------------------------------------------");
		Log.info("------- S--T--A--R--T-----  "+"startTestCaseName"+"   ------------------");
		Log.info("------------------------------------------------------------------------");
	}
	
	/*
	 * This is to print log for the ending of the test case
	 */
	
	public static void endOfTestCase(String startTestCaseName) {
		Log.info("xxxxxxxxxxxxxx   "+startTestCaseName+"      --E--N--D---xxxxxxxx");
	}
	
	/*
	 * These methods are created to give appropriate messages
	 */
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void warn(String message) {
		Log.warn(message);
	}
	
	public static void error(String message) {
		Log.error(message);
	}
	
	public static void fatal(String message) {
		Log.fatal(message);
	}
	
	public static void debug(String message) {
		Log.debug(message);
	}
	
	
	
	
}
