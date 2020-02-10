package selenium_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\javaprograms\\\\selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/tableexp.html");
		driver.findElement(By.id("button1")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.quit();
		
	}

}
