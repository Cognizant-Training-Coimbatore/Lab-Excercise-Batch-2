package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques8
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement rem = driver.findElement(By.name("RememberMe"));
		boolean res = rem.isSelected();
		if(res == true)
		{
			System.out.println("Already selected");
		}
		else
		{
			System.out.println("Not selected");
			rem.click();
		}
		

	}

}
