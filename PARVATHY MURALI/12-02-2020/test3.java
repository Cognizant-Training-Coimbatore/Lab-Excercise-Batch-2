package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports reports=new ExtentReports("Report.testcase3.html");
		ExtentTest test=reports.startTest("test3");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html");
		Select country1=new Select(driver.findElement(By.xpath("/html/body/select[1]")));
		country1.selectByVisibleText("India");
		Select country2=new Select(driver.findElement(By.xpath("/html/body/select[2]")));
		country2.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement s=country1.getFirstSelectedOption();
		WebElement d=country2.getFirstSelectedOption();
		if (s.equals(d))
		{

			test.log(LogStatus.FAIL, "same source and destination");
		}
		else
		{
			test.log(LogStatus.PASS, "no error");
		}
		reports.endTest(test);
		reports.flush();
		driver.quit();
		
		
	}

}
