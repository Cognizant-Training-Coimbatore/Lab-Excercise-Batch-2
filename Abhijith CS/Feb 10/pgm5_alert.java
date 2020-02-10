package webdriverdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm5_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\sample.html");
		driver.findElement(By.id("button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
