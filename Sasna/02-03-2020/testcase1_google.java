import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testcase1_google{
 
  {
	  WebDriver driver;
	  logger log = new logger();
  }
  @Test
  public void f() {
	  driver.findElement(By.linkText("Register")).click();
	  log.writeLog("Register has been clicked");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver  new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  log.writeLog("Application has been launched");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  log.writeLog("Browser has been closed.....");
  }

}
