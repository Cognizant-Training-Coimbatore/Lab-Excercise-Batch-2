package feb14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage 
{
	WebDriver driver;
	WebElement login;
	public homepage(WebDriver driver) 
	{
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	void clicklogin()
	{
		login=driver.findElement(By.linkText("Log in"));
		login.click();
	}
}
