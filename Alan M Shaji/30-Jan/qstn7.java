package seleniumDriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qstn7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s= driver.getTitle();
		System.out.println(s);
		WebElement fish_Link=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fish_Link.click();
		Thread.sleep(1000);
		
		WebElement fish_1=driver.findElement(By.linkText("FI-SW-01"));
		fish_1.click();
		Thread.sleep(1000);
		
		WebElement add_to_Cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		add_to_Cart.click();
		Thread.sleep(1000);
		
		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		Thread.sleep(6000);
		driver.quit();
	}

	}

