package feb_14_pgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class firefoxtest {
	WebDriver driver;
	WebElement register,login,fname,lname,username,pswd;
  @Test
  public void test1_register() throws InterruptedException
  {
	  register=driver.findElement(By.linkText("Register"));
	  register.click();
	  fname=driver.findElement(By.name("FirstName"));
	  fname.sendKeys("some firstname");
	  lname=driver.findElement(By.name("LastName"));
	  lname.sendKeys("some lastname");
	  Thread.sleep(5000);
  }
  @Test
  public void test2_login() throws InterruptedException
  {
	  login=driver.findElement(By.linkText("Log in"));
	  login.click();
	  username=driver.findElement(By.name("Email"));
	  username.sendKeys("nikhilakamal");
	  pswd=driver.findElement(By.name("Password"));
	  pswd.sendKeys("nikhila@123");
	  Thread.sleep(5000);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("test started");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException
  {
	  driver.findElement(By.linkText("Tricentis")).click();
	  System.out.println("Test execution is over");
	  Thread.sleep(5000);
  }
  

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("Webdriver.gecko.driver", "geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
