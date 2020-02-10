package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java programs GBE\\selenium\\chromedriver.exe");
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("firstname1");
		driver.findElement(By.name("lastname")).sendKeys("lastname1");
		driver.findElement(By.name("reg_email__")).sendKeys("username");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456$");
		Select day = new Select(driver.findElement(By.id("day")));
		  day.selectByVisibleText("17");
		  Select month = new Select(driver.findElement(By.id("month")));
		  month.selectByVisibleText("Mar");
		  Select year = new Select(driver.findElement(By.id("year")));
		  year.selectByVisibleText("1998");
		  WebElement radio = driver.findElement(By.id("u_0_b"));
		  radio.click();
		  driver.findElement(By.id("u_0_13")).submit();
		
		
		//Wait 5 Seconds 
		Thread.sleep(5000);
		//Close the Browser
		driver.quit();
	}

}
