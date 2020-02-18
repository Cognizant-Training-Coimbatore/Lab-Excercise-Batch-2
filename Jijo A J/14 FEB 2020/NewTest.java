import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class NewTest {
WebDriver driver;
@Test
public void f()
{
	String s="Demo Web Shop";
	String actualOutput=driver.getTitle();
	assertEquals(actualOutput, s);
	}
@BeforeTest
public void beforeTest()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String d="http://demowebshop.tricentis.com";
	driver.get(d);
	
	}
@AfterTest
public void afterTest()
{
	driver.quit();
	}
}
