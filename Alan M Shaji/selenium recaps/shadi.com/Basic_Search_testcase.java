import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Search_testcase {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
		Basic_search obj = new Basic_search(driver);
		obj.launch();
		
	  obj.SelectNoChild();
	  obj.ClickSearch();
		
  }
  @BeforeSuite
	public void launchApp()
	{
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		driver=new ChromeDriver();	
	}
  
}
