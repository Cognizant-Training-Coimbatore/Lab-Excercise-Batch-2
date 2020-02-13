package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test6 {

	public static void main(String[] args)
	{
		ExtentReports reports=new ExtentReports("Report.testcase6.html");
		ExtentTest test=reports.startTest("test6");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement t1=driver.findElement(By.id("t1"));
		t1.sendKeys("Hello");
		WebElement t2=driver.findElement(By.id("t2"));
		t2.sendKeys("helloo");
		String s=t1.getAttribute("value");
		String t=t2.getAttribute("value");
		if(s.equals(t))
		{
			test.log(LogStatus.PASS, "SUCCESS");
		}
		else
			
			test.log(LogStatus.FAIL, "TEXTBOXES DID NOT MATCH");

		reports.endTest(test);
		reports.flush();
		driver.quit();
		
		
		
		

	}

}
