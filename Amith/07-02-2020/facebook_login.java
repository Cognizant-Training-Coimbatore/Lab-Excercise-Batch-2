package basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java_programs\\selenium examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement firstname= driver.findElement(By.id("u_0_m"));
		firstname.click();
		firstname.sendKeys("Amith");
		WebElement surname= driver.findElement(By.id("u_0_o"));
		surname.click();
		surname.sendKeys("C");
		WebElement emailid= driver.findElement(By.id("u_0_r"));
		emailid.click();
		emailid.sendKeys("amithpalappatta@gmail.com");
		WebElement emailid2= driver.findElement(By.id("u_0_u"));
		emailid2.click();
		emailid2.sendKeys("amithpalappatta@gmail.com");
		WebElement pass= driver.findElement(By.id("u_0_w"));
		pass.click();
		pass.sendKeys("Amith1234@");
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("21");
		Select month= new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Sept");
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1997");
		WebElement mal=driver.findElement(By.id("u_0_a"));
		mal.click();
		Thread.sleep(5000);
		WebElement signup=driver.findElement(By.linkText("Sign Up"));
				signup.click();
				driver.quit();
		
	}

}
