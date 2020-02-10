package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_get_attribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/cts%20app.html");
		driver.findElement(By.id("txt1")).sendKeys("betty123");
		Thread.sleep(5000);
		String s=driver.findElement(By.id("txt1")).getAttribute("value");
		driver.quit();
		
	}

}
