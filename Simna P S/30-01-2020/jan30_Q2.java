package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jan30_Q2 
{

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement log = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		log.click();
		Thread.sleep(5000);
		WebElement logi = driver.findElement(By.linkText("FI-SW-01"));
		logi.click();
		Thread.sleep(5000);
		WebElement lo = driver.findElement(By.linkText("Add to Cart"));
		lo.click();
		Thread.sleep(5000);
		WebElement quantity;
		quantity = driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
	

	}

}
