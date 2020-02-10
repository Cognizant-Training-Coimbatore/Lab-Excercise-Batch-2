package batch2Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_program4_handling_alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("pp@12345");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
