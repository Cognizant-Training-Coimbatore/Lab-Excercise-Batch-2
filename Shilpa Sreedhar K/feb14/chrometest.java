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
	WebElement register,login,fname,lname;
	WebElement username;
    WebElement pwd;
	
	@Test
	  public void test1_register()
	  {
		register=driver.findElement(By.linkText("Register"));
		register.click();
		fname=driver.findElement(By.name("FirstName"));
		fname.sendKeys("some firstname");
		lname=driver.findElement(By.name("LastName"));
		lname.sendKeys("some lastname");
		
	  }
	
  @Test
  public void test2_login()
  {
	 login= driver.findElement(By.linkText("Log in"));
	 login.click();
	 username= driver.findElement(By.name("Email"));
	 username.sendKeys("venkat");
	 pwd=driver.findElement(By.name("password"));
	 pwd.sendKeys("venkat123$");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Test started..");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.findElement(By.linkText("Tricentis")).click();
	  System.out.println("test execution is over..");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
