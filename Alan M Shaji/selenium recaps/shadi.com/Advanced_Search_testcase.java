import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Advanced_Search_testcase extends Basic_Search_testcase{
@Test
public void f() throws InterruptedException {
	Advanced_search obj1 = new Advanced_search(driver);	
	obj1.launch();
	obj1.SelectNoChild();
	  obj1.ClickSearch();
	 obj1.postedBy();
}
@AfterSuite
public void closeApp()
{
	driver.quit();
}
}
