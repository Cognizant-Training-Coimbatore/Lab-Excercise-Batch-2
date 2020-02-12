package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_test1.html");
		ExtentTest test = report.startTest("Fb_test");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Java%20Programming/Selenium_examples/testcase1.html.html");
		WebElement user= driver.findElement(By.id("t1"));
		Thread.sleep(3000);
		user.sendKeys("username1");
		driver.findElement(By.id("b1")).click();
		String s=user.getAttribute("value");
		Thread.sleep(3000);
		driver.quit();
		if(s.length()!=0)
		{
			test.log(LogStatus.PASS," not empty");
		}
		else
		{
			test.log(LogStatus.FAIL,"  empty");
		}
		report.endTest(test);
		report.flush();
		
		
	}

}
