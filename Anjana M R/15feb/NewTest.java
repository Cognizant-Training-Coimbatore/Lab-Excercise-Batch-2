import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver;
	@Test
  public void f() {
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
  }
}
