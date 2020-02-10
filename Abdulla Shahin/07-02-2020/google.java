package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys("first");
		driver.findElement(By.id("u_0_o")).sendKeys("second");
		driver.findElement(By.id("u_0_r")).sendKeys("shaheengps@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("qwerty@123");
		driver.findElement(By.id("u_0_u")).sendKeys("shaheengps@gmail.com");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("12");
		Select month = new Select(driver.findElement(By.id("month")));
		day.selectByVisibleText("May");
		Select year = new Select(driver.findElement(By.id("year")));
		day.selectByVisibleText("1996");
		driver.findElement(By.id(""));
		
		//driver.findElement(By.id("u_0_b")).submit();
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
