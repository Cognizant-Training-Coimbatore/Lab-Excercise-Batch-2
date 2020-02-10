package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Betty");
		driver.findElement(By.name("lastname")).sendKeys("Benny");
		driver.findElement(By.id("u_0_r")).sendKeys("8606686905");
		driver.findElement(By.id("u_0_w")).sendKeys("betty123");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("18");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(5000);
		
	}

}
