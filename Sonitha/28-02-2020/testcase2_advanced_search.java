package shaadiApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcase2_advanced_search 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	advanced_Search ASearch = new advanced_Search(driver);
	ASearch.test2();

  }
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.shaadi.com/search?search_type=smart_search&loc=top-nav");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }
}
