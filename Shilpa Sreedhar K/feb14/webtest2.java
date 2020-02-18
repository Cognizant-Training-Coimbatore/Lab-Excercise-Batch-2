import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class webtest2 {
	WebDriver driver;
	@Test
	  public void testcase1() {
		  String s="Demo web shop";
		  String actualOutput=driver.getTitle();
		  assertEquals(actualOutput,s);
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://demowebshop.tricents.com");
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

}
