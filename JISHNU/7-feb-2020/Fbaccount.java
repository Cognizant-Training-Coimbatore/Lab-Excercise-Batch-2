package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbaccount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Jishnu");
		driver.findElement(By.name("lastname")).sendKeys("Devadas");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).sendKeys("jishnudevadas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_u")).sendKeys("jishnudevadas@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("Jishnu@1234");
		Thread.sleep(1000);
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("24");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1995");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
