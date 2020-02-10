package project_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e9_day3_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("23456");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
