package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Nikhila");
		driver.findElement(By.name("lastname")).sendKeys("Kamal");
		driver.findElement(By.id("u_0_r")).sendKeys("7034965604");
		driver.findElement(By.id("u_0_w")).sendKeys("kamal@1994");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("17");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sept");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");
		driver.findElement(By.id("u_0_6")).click();
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
