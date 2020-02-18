import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Webtest2 {
	WebDriver driver;
  @Test 
  public void f() {
  String s="Demo Web Shop";
  String actualoutput=driver.getTitle();
  assertEquals(actualoutput,s);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  
  }

  @AfterTest
  public void afterTest() {
driver.quit();
  }

}
