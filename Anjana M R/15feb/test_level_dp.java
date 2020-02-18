import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class test_level_dp {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String userid, String password) throws Exception 
  {
 driver.findElement(By.id("identifierId")).sendKeys(userid);
 driver.findElement(By.id("identifierNext")).click();
 Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("passwordNext")).click();
	Thread.sleep(3000);
	driver.navigate().to("http://accounts.google.com/signin");
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://accounts.google.com/signin");
	  Thread.sleep(1000);
	
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "anjanarajeev12", "Anjana@8" },
      new Object[] { "test123", "test123" },
    };
  }
}
