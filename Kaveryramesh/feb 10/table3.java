package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class table3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\javaprograms\\\\selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/tableexp.html");
		driver.findElement(By.id("t1")).sendKeys("java");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}