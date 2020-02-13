package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent3 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase3.html");
		ExtentTest test=report.startTest("Test3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase3.html");
		Select fromcountry=new Select(driver.findElement(By.xpath("/html/body/select[1]")));
		fromcountry.selectByVisibleText("India");
		Select tocountry=new Select(driver.findElement(By.xpath("/html/body/select[2]")));
		tocountry.selectByVisibleText("India");
		Thread.sleep(2000);
		if(fromcountry.equals(tocountry))
		{
			test.log(LogStatus.FAIL,"Same source and destination not allowed");
			
		}
		else
			test.log(LogStatus.PASS,"Successful");
		
			
		report.endTest(test);
		report.flush();	
		

	}
	

}
