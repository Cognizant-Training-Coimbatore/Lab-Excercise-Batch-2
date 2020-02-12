package webDriverDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program14_alert_example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/test/blaa.html");
		driver.findElement(By.id("button1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
