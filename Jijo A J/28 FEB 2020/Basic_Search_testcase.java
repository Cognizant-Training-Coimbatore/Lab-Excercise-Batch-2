import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_Search_testcase {
	WebDriver driver=new ChromeDriver();
	Basic_search obj = new Basic_search(driver);
  @Test
  public void f() throws InterruptedException {
		
	  obj.SelectNoChild();
	  obj.ClickSearch();
	  
  }
  @BeforeTest
	public void launchApp()
	{
		obj.launch();
	}
  @AfterTest
	public void closeApp() throws InterruptedException
	{
		obj.close();
	}
}
