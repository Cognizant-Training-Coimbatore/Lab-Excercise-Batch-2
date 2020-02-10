package basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program6_comboBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/jomon/Desktop/CTS/Training/Selenium/app.html");
		
		Select combo1 = new Select(driver.findElement(By.id("combo1")));
		combo1.selectByVisibleText("OptionD");
		Thread.sleep(5000);
		driver.quit();

	}

}
