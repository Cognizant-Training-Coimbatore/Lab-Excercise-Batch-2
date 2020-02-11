package seleniumeg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java pgmng\\SeleniumEx\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("shilpa");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("sreedhar");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("8547366791");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("sreedhar123");
		Thread.sleep(2000);
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(5000);
		driver.quit();


	}

}
