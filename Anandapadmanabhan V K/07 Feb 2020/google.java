package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_m")).sendKeys("userrrr");
		driver.findElement(By.id("u_0_o")).sendKeys("user");
		driver.findElement(By.id("u_0_r")).sendKeys("9895992986");
		driver.findElement(By.id("u_0_w")).sendKeys("newuser1234");
		driver.findElement(By.id("u_0_u")).sendKeys("9895992986");

		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("7");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Feb");	
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.id("u_0_14")).click();
		Thread.sleep(5000);
		driver.quit();
		//driver.findElement(By.name("email")).submit();
	}

}
