package com.flipkart.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Properties;

public class Configuration {
	
	public static Properties properties;
	public static Properties properties1;
	
	public static String environment;
	public static String browser;
	public static String driverPath;
	public static String webUrl;
	
	public static String userName;
	public static String password;
	
	public static void main(String[] args) throws IOException {
		Configuration.setEnvironment();
		Configuration.setBrowser();
		Configuration.setUrl();
		Configuration.setDriverPath();
		System.out.println(Configuration.getUserName());
	}
	
//	static {
//		try {
//			setEnvironment();
//			setBrowser();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	// This method takes a "property name" as an input and return its respective value from .properties file
	// This method is written to minimize hard-code values
	
	public static String getProperty(final String propertyName) throws IOException {
		
		String fileName = Configuration.environment+".properties";
		File environmentFile = new File("src/test/resources/Config/"+fileName);
		FileInputStream fis = new FileInputStream(environmentFile);
		Configuration.properties = new Properties();
		Configuration.properties.load(fis);
		
		return Configuration.properties.getProperty(propertyName);
				
	}

	public static void setEnvironment() {
		
		// Fetching environment
		Configuration.environment = System.getProperty("environment");
		
		// Environment will be null as it is not assigned yet
		//System.out.println(Configuration.environment);
		
		// This is where Test Engineer can set the environment to be tested
		if(Configuration.environment == null) {
			Configuration.environment = "C1";
		}
		
	}
	
	public static void setBrowser() throws IOException {
		
		// Fetching browser
		Configuration.browser = System.getProperty("browser");
		
		// The value of browser will be null as first
		//System.out.println(Configuration.browser);
		
		// Assigning the browser value from properties file
		if(Configuration.browser == null) {
			Configuration.browser = Configuration.getProperty("browser");
		}
		
		//System.out.println(Configuration.browser);
	}
	
	public static void setUrl() throws IOException {
		
		// Fetching webUrl
		Configuration.webUrl = System.getProperty("webUrl");
		
		// The value of webUrl will be null at first
		//System.out.println(Configuration.webUrl);
		
		if(Configuration.webUrl == null) {
			Configuration.webUrl = Configuration.getProperty("flipkartUrl");
		}
		
		//System.out.println(Configuration.webUrl);
		
		
	}
	
	public static void setDriverPath() {
		
		/*
		 * This line of code gives the present working directory of user
		 */
		String path = System.getProperty("user.dir");
		
		/*
		 * This is where we set the path of the driver 
		 */
		Configuration.driverPath = Configuration.properties.getProperty("driverPath", path+"\\src\\test\\resources\\Drivers\\");
		
		
		System.out.println(Configuration.driverPath);
	}
	
	public static String getUserName() {
		return Configuration.userName = Configuration.properties.getProperty("emailId");
	}
	
	
	
}
