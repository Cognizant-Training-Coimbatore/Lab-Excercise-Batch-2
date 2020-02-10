import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program12_keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/table1.html");
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL,"v");		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		

	}

}
