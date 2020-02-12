package report;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_4.html");
		ExtentTest test=report.startTest("TC4");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html");
		driver.findElement(By.id("c1")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("APJ");
		alert.accept();
		String s=driver.findElement(By.id("t1")).getAttribute("value").toString();
		if(s.contains("APJ"))
		{
			test.log(LogStatus.PASS, "same text is copied");
		}
		else
		{
			test.log(LogStatus.FAIL, "Different text is copied");
		}
		report.endTest(test);
		report.flush();
	        driver.quit();
	}

}
