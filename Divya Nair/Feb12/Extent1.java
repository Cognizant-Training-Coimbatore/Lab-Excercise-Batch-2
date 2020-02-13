package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase1.html");
		ExtentTest test=report.startTest("TC1_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase1.html");
		WebElement id=driver.findElement(By.id("t1"));
		WebElement btn=driver.findElement(By.id("b1"));
		id.sendKeys("Elephant");
		btn.click();
		WebElement id2=driver.findElement(By.id("t2"));
		
		if(id!=null)
		{
			if(id2!=null)
			{
				test.log(LogStatus.PASS, "The length is displayed");
			}
			else
			
				test.log(LogStatus.FAIL, "The length is not displayed");
			
		}
		report.endTest(test);
		report.flush();
	}
	



	}


