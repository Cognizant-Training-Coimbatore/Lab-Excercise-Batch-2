package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_link_click_fish
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click();
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		WebElement fishid=driver.findElement(By.linkText("FI-SW-01"));
		Thread.sleep(3000);
		fishid.click();
		WebElement add_cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		Thread.sleep(3000);
		add_cart.click();
		
		WebElement Quantity;
		Quantity =driver.findElement(By.id("lines0.quantity"));
		driver.findElement(By.id("lines0.quantity")).clear();
		Thread.sleep(3000);
		Quantity.sendKeys("10");
		Thread.sleep(3000);
		String s=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(s);
		driver.quit();

	}
}
