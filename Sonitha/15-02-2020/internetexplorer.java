import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class internetexplorer 
{
    WebDriver driver;
	WebElement register,login,fname,lname,username,pwd;
  
  @Test
  public void test1_register() 
  {
	register = driver.findElement(By.linkText("Register"));
	register.click();
	fname = driver.findElement(By.name("FirstName"));
	fname.sendKeys("some firstname");
	lname = driver.findElement(By.name("LastName"));
	lname.sendKeys("some lastname");
  }
  
  @Test
  public void test2_login() 
  {
	  login = driver.findElement(By.linkText("Log in"));
	  login.click();
	  username = driver.findElement(By.name("Email"));
	  username.sendKeys("Venkat");
	  pwd = driver.findElement(By.name("Password"));
	  pwd.sendKeys("venkat123$");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Test started....");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.findElement(By.linkText("Tricentis")).click();
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.get("http://demowebshop.tricentis.com"); 
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
	  System.out.println("Test execution is over");
  }

}
