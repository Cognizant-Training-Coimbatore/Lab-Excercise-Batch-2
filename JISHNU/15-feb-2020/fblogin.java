package feb15;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class fblogin {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://accounts.google.com/signin");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
