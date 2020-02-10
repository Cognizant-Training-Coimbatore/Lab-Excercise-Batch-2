package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Selenium\\table.html");
		
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL, "c");
		
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL, "v");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
