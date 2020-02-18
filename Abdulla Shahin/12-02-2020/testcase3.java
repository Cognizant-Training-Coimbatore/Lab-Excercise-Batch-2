import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_testcase3.html");
		ExtentTest test = report.startTest("testcase3");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase.3.html.htm");
		Select from = new Select(driver.findElement(By.id("country1")));
		from.selectByVisibleText("India");
		Select to = new Select(driver.findElement(By.id("country2")));
		to.selectByVisibleText("India");
		String s = from.getFirstSelectedOption().getText();
		String t = to.getFirstSelectedOption().getText();
		if (s.equals(t))
		{
			test.log(LogStatus.FAIL, "Failed");
				
		}
		else
		{
			test.log(LogStatus.PASS, "PASSED");
				
		}
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
	}

}
