package basicCommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11_alertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Selenium\\table.html");
		
		driver.findElement(By.id("button1")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
