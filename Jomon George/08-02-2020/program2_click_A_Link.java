package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2_click_A_Link {

	public static void main(String[] args) throws InterruptedException {

//		1. Launch Chrome browser
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		2. Open the URL
		driver.get("file:///C:/Users/jomon/Desktop/CTS/Training/Selenium/app.html");

		WebElement link1 = driver.findElement(By.linkText("Google"));
		link1.click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
