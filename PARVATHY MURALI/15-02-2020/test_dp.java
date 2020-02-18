package repository;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class test_dp {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  driver.findElement(By.id(" identifierId")).sendKeys(username);
	  driver.findElement(By.id("identifierNext")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("passwordNext")).click();
	  Thread.sleep(3000);
	  driver.navigate().to("https://accounts.google.com/ServiceLogin/identifier");
	  
	  
	  
  }
  @BeforeClass 
  
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/ServiceLogin/identifier");
  }
  

  @AfterClass
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "gmail.gmail.test", "paru123***" },
      new Object[] { "test", "test123" },
    };
  }
}
