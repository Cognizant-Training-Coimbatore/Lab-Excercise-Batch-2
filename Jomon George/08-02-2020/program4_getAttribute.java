package basicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_getAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/jomon/Desktop/CTS/Training/Selenium/app.html");
		
		Thread.sleep(5000);
		System.out.println((driver.findElement(By.id("txt1")).getAttribute("value")).length());
		Thread.sleep(5000);
		driver.quit();
	}

}
