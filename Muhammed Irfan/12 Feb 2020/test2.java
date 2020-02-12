package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_test2.html");
		ExtentTest test = report.startTest("Fb_test");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Java%20Programming/Selenium_examples/testcase2.html.html");
		Select os=new Select(driver.findElement(By.id("country")));
		int s= os.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(String.valueOf(s));
		Thread.sleep(3000);
		
		
		if(driver.getTitle().equals("pagetitle"))
		{
			test.log(LogStatus.PASS," title match");
		}
		else
		{
			test.log(LogStatus.FAIL,"  title not match");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
