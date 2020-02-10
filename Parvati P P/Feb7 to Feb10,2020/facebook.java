package ptogram1_selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Java Programs\\Selenium_Examples\\chromedriver_win32\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("catchmeparvati@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("parvati");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_m")).sendKeys("Parvati");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_o")).sendKeys("Prakash");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).sendKeys("9526741693");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_w")).sendKeys("pp@12345");
		Thread.sleep(1000);
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("18");
		Thread.sleep(1000);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jun");
		Thread.sleep(1000);
		Select Year=new Select(driver.findElement(By.id("year")));
		Year.selectByVisibleText("1996");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(1000);
       
		driver.quit();
	}

}
