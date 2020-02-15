import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases12 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  ExtentReports report = new ExtentReports("Report_testcases12.html");
	  ExtentTest test = report.startTest("testcases12");
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("file:///C:/Users/Admin/Downloads/testcase12.htm");
	  WebElement ele=driver.findElement(By.id("b1"));
	  ele.click();
	  WebElement textbox;
	  textbox = driver.findElement(By.id("t1"));
	  textbox.clear();
	  textbox.sendKeys("Name1");
	  driver.findElement(By.id("b4")).click();
	  Alert alert = driver.switchTo().alert();
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
	  if(textbox.isEnabled())
	  {
		test.log(LogStatus.FAIL, "the textbox is enabled"); 
		System.out.println("the textbox is enabled");
	  }
	  else
	  {
		test.log(LogStatus.PASS, "the textbox is disabled");
		System.out.println("the textbox is disabled");
	  }
	  
	  Thread.sleep(2000);
	  report.endTest(test);
	  report.flush();
	  driver.quit();
	  

	}

}
