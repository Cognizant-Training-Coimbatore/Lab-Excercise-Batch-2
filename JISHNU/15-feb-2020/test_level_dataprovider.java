package feb15;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class test_level_dataprovider {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String uid, String pwd) throws InterruptedException {
	  driver.findElement(By.id("identifierId")).sendKeys(uid);
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("passwordNext")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://accounts.google.com/signin");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "jishnu", "jishnu" },
      new Object[] { "test123", "test123" },
    };
  }
}
