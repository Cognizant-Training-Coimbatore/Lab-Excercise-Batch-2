package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
				//Launch the chrome browser
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("u_0_m")).sendKeys("blablabla");
				
				driver.findElement(By.id("u_0_o")).sendKeys("blablabla");
				driver.findElement(By.id("u_0_r")).sendKeys("8281354450");
				driver.findElement(By.id("u_0_w")).sendKeys("blablabla");
				
				Select day=new Select(driver.findElement(By.id("day")));
				day.selectByVisibleText("28");
				Select month=new Select(driver.findElement(By.id("month")));
				month.selectByVisibleText("Feb");
				Select year=new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("1997");
				driver.findElement(By.id("u_0_6")).click();
				driver.findElement(By.id("u_0_13")).click();
				
	}

}
