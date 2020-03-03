import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test2 {
	WebDriver driver;
  looger obj=new looger();
	@Test
  public void f() {
		if(driver.getTitle().equals("RedBus"))
				obj.writelog("RedBus Title is verified");
		else
			obj.writelog("RedBus Title is different");

  }	
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
