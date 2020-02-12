package extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_test3.html");
		ExtentTest test = report.startTest("Fb_test");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Java%20Programming/Selenium_examples/testcase3.html.html");
		Select os=new Select(driver.findElement(By.id("country1")));
		os.deselectByVisibleText("India");
		
		
		
		
		
		
		
		
		
		
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
