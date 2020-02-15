import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class webtest2 { 
	WebDriver driver;
 @Test
   public void f() {
	  String s="Demo Web Shop";
	  String actualOutput=driver.getTitle();
	  assertEquals(actualOutput,s);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();

  }
 
}
