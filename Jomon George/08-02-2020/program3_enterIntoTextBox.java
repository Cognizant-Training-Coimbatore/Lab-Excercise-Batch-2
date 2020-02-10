package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enterIntoTextBox {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/jomon/Desktop/CTS/Training/Selenium/app.html");

		driver.findElement(By.id("txt1")).sendKeys("Hello world");
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
