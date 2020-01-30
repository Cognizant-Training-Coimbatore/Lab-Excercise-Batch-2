package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://jpetstore.cfapps.io/");
	        WebElement enter=driver.findElement(By.linkText("Enter the Store"));
	        enter.click();
	      
	        String s=driver.getTitle();
	      System.out.println(s);
	      WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
	        fish.click();
	        Thread.sleep(2000);
	        WebElement fish1=driver.findElement(By.linkText("FI-SW-01"));
	        fish1.click();
	        Thread.sleep(2000);
	        WebElement cart=driver.findElement(By.linkText("Add to Cart"));
	        cart.click();
	        Thread.sleep(2000);
	        WebElement quant;
	        quant=driver.findElement(By.id("lines0.quantity"));
	        driver.findElement(By.id("lines0.quantity")).clear();
	        quant.sendKeys("10");
	        Thread.sleep(2000);
	      driver.quit();

	}

}
