

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	WebElement username,password;
	
	loginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	void enterUsername(String s)
	{
		username = driver.findElement(By.id("Email"));
		username.sendKeys(s);
	}
	void enterPassword(String s)
	{
		password = driver.findElement(By.id("Password"));
		password.sendKeys(s);
	}
}
