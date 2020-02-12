package extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extend_Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("ExtentReportsResults.html");
		ExtentTest test = report.startTest("Extend_Report");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		if(driver.getTitle().equals("Google123"))
		{
		test.log(LogStatus.PASS, "The Title is Matched");
		}
		else
		{
			test.log(LogStatus.FAIL, "The Title isnt Matched");
		}
		report.endTest(test);
		report.flush();
		driver.quit();

}
}