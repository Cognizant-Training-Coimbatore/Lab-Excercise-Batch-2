package podemo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class chrometest {
	WebDriver driver;
	WebElement register,username,login,password,fname,lname;
  @Test
  public void test1_register() {
	  register=driver.findElement(By.linkText("Register"));
	  register.click();
	  fname=driver.findElement(By.name("FirstName"));
	  username.sendKeys("some bla");
	  lname=driver.findElement(By.name("LastName"));
	  lname.sendKeys("someblaa");
	  
  }
  public void test2_login() {
	  login=driver.findElement(By.linkText("Log in"));
	  login.click();
	  username=driver.findElement(By.name("Email"));
	  username.sendKeys("ardra");
	  password=driver.findElement(By.name("Password"));
	  password.sendKeys("ardra123");
	  
  }
  @BeforeTest
  public void beforeMethod() {
	  System.out.println("Test started");}
  
  public void afterMethod() {
	  driver.findElement(By.linkText("Tricentis")).click();
	  System.out.println("Test execution is over");
  }
  
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver=new ChromeDriver();
      driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
