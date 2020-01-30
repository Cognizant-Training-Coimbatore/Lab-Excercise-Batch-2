package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm5_testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String s= driver.getTitle();
		System.out.println(s);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fish.click();
		Thread.sleep(3000);
		
		WebElement id = driver.findElement(By.linkText("FI-SW-01"));
		id.click();
		Thread.sleep(3000);
		WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart1.click();
		Thread.sleep(3000);
		WebElement quantity;
		quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
