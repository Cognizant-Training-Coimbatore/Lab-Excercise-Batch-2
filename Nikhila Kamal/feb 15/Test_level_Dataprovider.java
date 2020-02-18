package feb_14_pgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Test_level_Dataprovider {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String uid, String pwd) throws InterruptedException 
  {
	  driver.findElement(By.name("identifier")).sendKeys(uid);
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.id("passwordNext")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/ServiceLogin/identifier");
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "nikhilakamalk", "nikhilakamalk" },
      new Object[] { "nikhila123", "nikhila123" },
    };
  }
}
