package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date30_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement login1=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		login1.click();
		Thread.sleep(5000);
		WebElement login2=driver.findElement(By.linkText("FI-SW-01"));
		login2.click();
		Thread.sleep(5000);
		WebElement login3=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		login3.click();
		Thread.sleep(5000);
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		
		quantity.sendKeys("0");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
