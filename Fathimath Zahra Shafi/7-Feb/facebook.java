package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java_programs\\selenium_examples\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys("fathima");
		driver.findElement(By.id("u_0_o")).sendKeys("zahra");
		driver.findElement(By.id("u_0_r")).sendKeys("9897654327");
		driver.findElement(By.id("u_0_w")).sendKeys("fathima123");
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("23");
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		
		driver.findElement(By.id("u_0_6")).click();
		
		
		
		driver.findElement(By.id("u_0_13")).click();
		
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
