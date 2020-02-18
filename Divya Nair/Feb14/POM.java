package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM
{
	WebDriver driver;
	WebElement login;
	
	POM(WebDriver driver)
	{
		this.driver=driver;
	}
	void clickLogin()
	{
		login=driver.findElement(By.linkText("Log in"));
		login.click();
		
	}

}
