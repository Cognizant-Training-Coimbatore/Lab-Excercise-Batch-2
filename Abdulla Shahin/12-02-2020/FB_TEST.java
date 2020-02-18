package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class FB_TEST {

	public static void main(String[] args)
	{
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("FB_TEST");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement uid = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		uid.sendKeys("shaheen");
		//pass.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
		if(uid!=null)
		{
			if(pass!=null)
			{
				test.log(LogStatus.PASS, "Passed");
			}
			else
			{
				test.log(LogStatus.FAIL, "Failed");
			}
		}
		else
		{
			test.log(LogStatus.FAIL, "Failed");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
