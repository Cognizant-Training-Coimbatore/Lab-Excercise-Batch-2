package shaadiApp;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class testcase1_basic_search 
{
	WebDriver driver;
	 
  @Test
  public void f() throws InterruptedException
  {
	  basic_search BSearch = new basic_search(driver);
	  BSearch.test1();
	
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.shaadi.com/search?search_type=basic_search&loc=top-nav");
	  driver.manage().window().maximize();
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
