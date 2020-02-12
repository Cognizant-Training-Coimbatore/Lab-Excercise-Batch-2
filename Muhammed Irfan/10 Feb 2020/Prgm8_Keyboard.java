package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm8_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Selenium/sample12.html");
		
		driver.findElement(By.id("t1")).sendKeys("Java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");
		
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");
		
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
	}

}
