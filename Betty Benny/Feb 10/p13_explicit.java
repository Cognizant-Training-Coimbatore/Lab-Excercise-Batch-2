package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p13_explicit {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.get("http://demowebshop.tricentis.com");
		WebElement loginlink;
		loginlink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
		
		loginlink.click();
		driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
