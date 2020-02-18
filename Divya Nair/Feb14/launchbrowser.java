package repository;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class launchbrowser {
  
	WebDriver driver;
	@BeforeTest
	  public void launchbrowser() 
	{
		driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
	}
	@Test(dataProvider = "dp")
  public void f(String username,String password) 
	
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.linkText("Tricentis")).click();
	}

  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
	  new Object[] {"user1","pass1" },
	  new Object[] { "user2","pass2" },
	  new Object[] { "user3","pass3" } 
    };
  }
  

  @AfterTest
  public void closebrowser()
  {
	  driver.quit();
  }

}
