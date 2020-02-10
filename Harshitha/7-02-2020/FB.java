package basic_Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java Programs\\Selenium_Examples\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();//for maximizing browser
		driver.findElement(By.name("firstname")).sendKeys("Roshna");
		driver.findElement(By.name("lastname")).sendKeys("Akku");
		driver.findElement(By.name("reg_email__")).sendKeys("8977679867");
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwertys123");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("28");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1994");
		driver.findElement(By.id("u_0_6")).click();;
		driver.findElement(By.id("u_0_13")).click();;
		
		
	}
}

		


