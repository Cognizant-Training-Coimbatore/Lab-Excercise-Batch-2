package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	WebElement login;
	
	homePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	void clickLogin()
	{
		login = driver.findElement(By.linkText("Log in"));
		login.click();
	}
}
