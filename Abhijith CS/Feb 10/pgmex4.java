package webdriverdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmex4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("abhi123");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
