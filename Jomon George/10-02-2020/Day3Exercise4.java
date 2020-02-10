package Exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("guru99");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();	

	}

}
