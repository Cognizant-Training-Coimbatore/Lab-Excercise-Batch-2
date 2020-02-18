import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataprovider_2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String username, String password) throws InterruptedException {
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.name("Email")).sendKeys(username);
	  
	  driver.findElement(By.name("Password")).sendKeys(password);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "user1", "a13546484684" },
      new Object[] { "alan m shaji", "b545554444" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String d="http://demowebshop.tricentis.com";
		driver.get(d);
		
		
		
		
  }

  @AfterTest
  public void afterTest() {
  }

}
