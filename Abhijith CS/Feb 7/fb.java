package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ABHIJITH C S\\selenium\\selenium examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("User1");
		//driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.id("u_0_m")).sendKeys("Abhijith");
		driver.findElement(By.id("u_0_o")).sendKeys("C S");
		driver.findElement(By.id("u_0_r")).sendKeys("01234567891");
		driver.findElement(By.id("u_0_w")).sendKeys("9567891641");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("8");
		Select mon = new Select(driver.findElement(By.id("month")));
		mon.selectByVisibleText("Mar");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(6000);
		driver.quit();
	}

}
