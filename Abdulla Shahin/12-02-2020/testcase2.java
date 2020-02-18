import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_testcase2.html");
		ExtentTest test = report.startTest("testcase2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase2.html");
		Select combo1 = new Select(driver.findElement(By.id("country")));
		int s = combo1.getOptions().size();
		String str1 = Integer.toString(s); 
		driver.findElement(By.id("t1")).sendKeys(str1);
		Thread.sleep(2000);
		if(s==11)
		{
			test.log(LogStatus.PASS, "Passed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Failed");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
