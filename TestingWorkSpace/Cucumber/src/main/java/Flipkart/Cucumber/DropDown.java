package Flipkart.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AAD\\TestingWorkSpace\\Flipkart\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		Thread.sleep(3000);
		
		
		
		/*
		 * Selecting a bootstrap drop down is a three step process
		 * 1. First click on the drop down
		 * 2. Get the xpath for drop down values
		 * 3. Iterate over a loop and select the value
		 */
		
		
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Thread.sleep(1000);
		
		List<WebElement> dropDown1 = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		
		System.out.println(dropDown1.size());
		
		for(int i=0; i<dropDown1.size(); i++) {
			System.out.println(dropDown1.get(i).getText());
		}
		
		System.out.println("After for loop");
		
		
		for (WebElement dropDown2: dropDown1) {
			String value = dropDown2.getAttribute("innerHTML");
			System.out.println(value);
			if(value=="JavaScript") {
				dropDown2.click();
				break;
			}
		}
	}
}
