package webDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://jpetstore.cfapps.io/");
	       WebElement  login=driver.findElement(By.linkText("Enter the Store"));
	       login.click();
	       driver.get("https://jpetstore.cfapps.io/catalog/categories/FISH");
	       
	       WebElement  set=driver.findElement(By.linkText("FI-SW-01"));
	       set.click();
	       driver.get("https://jpetstore.cfapps.io/cart?add&itemId=EST-1");
	       WebElement quatity;
	       quatity=driver.findElement(By.id("lines0.quantity"));
	       quatity.sendKeys("0");
           Thread.sleep(5000);
	       driver.quit();

	}

}
