package feb_14_pgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class webtest2 {
	WebDriver driver;
	
  @Test
  public void testcase2()
  {
	  String s="Demo Web Shop";
	  String actualOutput=driver.getTitle();
	  assertEquals(actualOutput, s);
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.quit();
	
  }

}
