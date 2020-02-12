import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase2 {

	public static void main(String[] args) {
		
		ExtentReports report = new ExtentReports("Report_testcase2.html");
		ExtentTest test = report.startTest("testcase2");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.htm");
		Select sel = new Select(driver.findElement(By.id("country")));
		int n=sel.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(n+"");
		if(n != sel.getOptions().size())
		{
			test.log(LogStatus.SKIP, "count values in the combo box");
		}
		else
		{
			test.log(LogStatus.PASS,"the values matches");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		

	}

}
