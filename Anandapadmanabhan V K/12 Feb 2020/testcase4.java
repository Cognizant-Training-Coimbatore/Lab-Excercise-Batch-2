package basic_command;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase4.html");
		ExtentTest test=report.startTest("testcase4");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase4.html");
		WebElement read=driver.findElement(By.id("c1"));
		read.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Balarama");
		alert.accept();
		String s=driver.findElement(By.id("t1")).getAttribute("value");
		if(s.contains("Balarama"))
		{
			test.log(LogStatus.PASS,"Passed");
		}
		else
		{
			test.log(LogStatus.FAIL,"Failed");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
