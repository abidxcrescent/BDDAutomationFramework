package Flipkart.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AAD\\TestingWorkSpace\\Cucumber\\Config\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(100);
		
		//driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]")).sendKeys("Java Books");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java Books");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//driver.findElement(By.xpath("//button[ends-with(@class,'0Z3Pu')]")).click();
		Thread.sleep(100);
	}
}