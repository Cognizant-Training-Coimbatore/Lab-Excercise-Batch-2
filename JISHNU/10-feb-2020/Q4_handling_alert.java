package feb10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4_handling_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("345672");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
