package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extentclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.FB.html");
		ExtentTest test=report.startTest("FB_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement uid=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		uid.sendKeys("divyan");
		pass.sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]"));
		if(uid!=null)
		{
			if(pass!=null)
			{
				test.log(LogStatus.PASS, "The title is matched");
			}
			else
			
				test.log(LogStatus.FAIL, "The title is not matched");
			
		}
		report.endTest(test);
		report.flush();
	}
	

}
