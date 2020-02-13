package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase2.html");
		ExtentTest test=report.startTest("TC2_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase2.html");
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		int total=country.getOptions().size();
		String str1 = Integer.toString(total);
		WebElement id=driver.findElement(By.id("t1"));
		id.sendKeys(str1);
		
		
		if(id!=null)
		{
			test.log(LogStatus.PASS, "The combo box size is displayed");
		}	
		else
			
			test.log(LogStatus.FAIL, "The combo box size is not displayed");
			
		
		report.endTest(test);
		report.flush();
	}

	}


