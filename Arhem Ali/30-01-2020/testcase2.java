package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		WebElement id=driver.findElement(By.linkText("FI-SW-01"));
		id.click();
		WebElement cart=driver.findElement(By.linkText("Add to Cart"));
		cart.click();
		WebElement quant;
		quant=driver.findElement(By.id("Quantity"));
		quant.sendKeys("10");
		Thread.sleep(50000);
		driver.quit();
		

	}

}
