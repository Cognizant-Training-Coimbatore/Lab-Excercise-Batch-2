package basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_radio {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/jomon/Desktop/CTS/Training/Selenium/app.html");
				
		List<WebElement> radio = driver.findElements(By.name("gender"));
		System.out.println(radio.get(1).isSelected());
		System.out.println(radio.get(0).isSelected());
		
		Thread.sleep(5000);
		radio.get(0).click();
		System.out.println(radio.get(0).isSelected());
		
		Thread.sleep(5000);
		driver.quit();

	}

}
