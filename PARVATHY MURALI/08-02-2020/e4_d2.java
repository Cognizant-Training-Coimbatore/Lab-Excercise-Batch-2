package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e4_d2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select data=new Select(driver.findElement(By.name("category_id")));
		data.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).submit();
		driver.findElement(By.linkText("Web Database Development")).click();
		//Select quality=new Select(driver.findElement(By.name("quantity")));
		String s = null;
		//driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(driver.findElement(By.name("quantity")).getAttribute("value"));
		Thread.sleep(3000);
		driver.quit();

	}

}
