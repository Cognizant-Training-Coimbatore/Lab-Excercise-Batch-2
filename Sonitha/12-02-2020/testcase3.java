import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_testcase3.html");
		ExtentTest test = report.startTest("testcase3");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase.3.html.htm");
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"country1\"]")));
		sel1.selectByIndex(2);
		
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"country2\"]")));
		sel2.selectByIndex(9);

		if(sel1.getFirstSelectedOption()==(sel2.getFirstSelectedOption()))
		{
			test.log(LogStatus.FAIL, "cannot enter same countries in both the fields");
			
		}
		else
		{
			test.log(LogStatus.PASS, "different countries are selected ");
		}
		
		report.endTest(test);
		report.flush();
		driver.quit();
		

	}

}
