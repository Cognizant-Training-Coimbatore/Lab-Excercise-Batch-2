package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class e_test2 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports reports=new ExtentReports("Report.testcase2.html");
		ExtentTest test=reports.startTest("e_test2");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
		Select country=new Select(driver.findElement(By.id("country")));
		int sizeof=country.getOptions().size();
		String s =Integer.toString(sizeof);
		driver.findElement(By.id("t1")).sendKeys(s);
		Thread.sleep(2000);
		if(country==null)
		{
			test.log(LogStatus.FAIL, "incorrect country count");
		}
		else
			
			test.log(LogStatus.PASS, "correct country count");

		reports.endTest(test);
		reports.flush();
		driver.quit();
	}

}
