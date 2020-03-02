import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test2 
{
	WebDriver driver;
	logger log = new logger();
	
  @Test
  public void f() 
  {
	  System.out.println(driver.getTitle());
	  String s=driver.getTitle();
	  if(s.equals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India"))
	  {
		  log.writelog("The title captured is correct");
	  }
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.redbus.in/");
	   log.writelog("The browser is initialized");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
	  log.writelog("The browser has been closed");
  }

}
