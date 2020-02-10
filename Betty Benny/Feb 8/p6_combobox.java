package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p6_combobox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/cts%20app.html");
		Select combo1=new Select(driver.findElement(By.id("combo1")));
		combo1.selectByVisibleText("optionD");
		Thread.sleep(5000);
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}

}
