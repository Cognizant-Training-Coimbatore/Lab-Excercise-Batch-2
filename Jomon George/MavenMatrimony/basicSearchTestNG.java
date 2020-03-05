import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class basicSearchTestNG {
	
  public static WebDriver driver;

  @Test
  public void f() {
	  
	  basicSearch object = new basicSearch(driver);
	  
	  object.selectBrideOrGroom("Groom");
	  object.selectAgeFrom("30");
	  object.selectAgeTo("40");
	  object.selectHeightFrom("160");
	  object.selectHeightTo("170");
	  object.selectCommunity("RC Syrian Christian");
	  object.clickSearch();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  	WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.chavaramatrimony.com/quick-serach-mobile.aspx");
		driver.manage().window().maximize();
	  
  }
  
  @AfterClass
  public void afterClass() throws InterruptedException {	  	
	  Thread.sleep(4000);	  
  }

}
