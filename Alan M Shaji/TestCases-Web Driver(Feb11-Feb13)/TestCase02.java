package Testcases_11_Feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report2.html");
		ExtentTest test=report.startTest("Extended_reports");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/TestCases_11Feb/testcase2.html.htm");
		Select country= new Select(driver.findElement(By.id("country")));
		String str=""+country.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(str);
		if(country.getOptions().size()==11)		
		{
			System.out.println("length is verified");
			test.log(LogStatus.PASS, "length is verified");
		}
		else
			test.log(LogStatus.FAIL, "length is not verified");
	
		Thread.sleep(4000);
		report.endTest(test);
		report.flush();
		driver.quit();	
	}

}
