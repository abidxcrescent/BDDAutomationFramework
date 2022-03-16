package com.flipkart.stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testing {
	//public static Properties properties;
	public static String webUrl;
	
	public static void main(String[] args) throws IOException {
		System.out.println("BDD Cucumber Framework");
//		
//		FileReader reader = new FileReader("C1.properties");
//		Properties properties = new Properties();
//		properties.load(reader);
		
		//Reading Properties file with hard-coding
		Properties properties=new Properties();
		FileInputStream fis = new FileInputStream("D:\\AAD\\TestingWorkSpace\\Flipkart\\src\\test\\resources\\Config\\C1.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("flipkartUrl"));
		
		//Reading Properties file without hard-coding
		FileInputStream fis2 = new FileInputStream(new File("src/test/resources/Config/C1.properties"));
		Properties properties2 = new Properties();
		properties2.load(fis2);
		System.out.println(properties2.getProperty("flipkartUrl"));
		
		
		
	
	}
}
