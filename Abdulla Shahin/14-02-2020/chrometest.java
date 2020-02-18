package pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class chrometest {
	WebDriver driver;
	WebElement register,login,fname,lname,username,pwd;
  @Test
  public void test1_register() 
  {
	  register = driver.findElement(By.linkText("Register"));
	  register.click();
	  fname = driver.findElement(By.name("FirstName"));
	  fname.sendKeys("Abdulla");
	  lname = driver.findElement(By.name("LastName"));
	  lname.sendKeys("Shaheen");
  }
  @Test
  public void test2_login()
  {
	  login= driver.findElement(By.linkText("Log in"));
	  login.click();
	  username = driver.findElement(By.name("Email"));
	  username.sendKeys("shaheen");
	  pwd = driver.findElement(By.name("Password"));
	  pwd.sendKeys("shaheen@123");
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("test started..");
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.findElement(By.linkText("Tricentis")).click();
	  System.out.println("text execution is over");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
