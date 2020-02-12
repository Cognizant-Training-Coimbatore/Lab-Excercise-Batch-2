package webDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard_event {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/test/blaa.html");
		
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL,"v");
		
		Thread.sleep(5000);
		driver.quit();


	}

}
