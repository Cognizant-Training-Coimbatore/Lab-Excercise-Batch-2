package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program_feb12_length_ofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report_length_of_string.html");
		ExtentTest test=report.startTest("program_feb12_length_ofstring");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html.html\r\n" + 
				"");
		WebElement uid=driver.findElement(By.id("t1"));

		uid.sendKeys("i am asha");
		driver.findElement(By.id("b1")).click();
		if(uid!=null)
		{
			test.log(LogStatus.PASS,"The length is displayed");
		}
		else
		{
			
			test.log(LogStatus.FAIL,"The length is not displayed");
			
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
	}

}
