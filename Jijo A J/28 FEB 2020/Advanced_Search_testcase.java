import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Advanced_Search_testcase {
	WebDriver driver=new ChromeDriver();
Advanced_search obj = new Advanced_search(driver);
@Test
public void f() throws InterruptedException {
	
	  obj.SelectNoChild();
	  obj.ClickSearch();
	 obj.ChatStatus();
	 obj.postedBy();
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
