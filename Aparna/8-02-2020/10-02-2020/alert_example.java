package selenium_new;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\selenium_new\\src\\selenium_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/table1.html");
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
