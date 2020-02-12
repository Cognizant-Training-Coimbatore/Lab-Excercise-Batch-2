package webDriverDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1123");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

	}


