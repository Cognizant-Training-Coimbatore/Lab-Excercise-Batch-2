package repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent4 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase4.html");
		ExtentTest test=report.startTest("Extent4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase4.html");
		WebElement check1=driver.findElement(By.id("c1"));
		check1.click();
	
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("Harry potter");
		alert.accept();
		
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.id("t1"));
		
		if(alert==text)
		{
			test.log(LogStatus.PASS, "The details match");
		}
		else
			test.log(LogStatus.FAIL, "The details does not match");
		
		report.endTest(test);
		report.flush();
		driver.quit();
	}
	

}
