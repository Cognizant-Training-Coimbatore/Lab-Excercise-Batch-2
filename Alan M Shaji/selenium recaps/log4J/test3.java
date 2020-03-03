import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class test3 {
	WebDriver driver;
  looger obj=new looger();
	@Test
  public void f() {
		if(driver.getTitle().equals("IRCTC Next Generation eTicketing System"))
				obj.writelog("IRCTC Next Generation eTicketing System Title is verified");
  }	
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.irctc.co.in/nget/train-search");	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
