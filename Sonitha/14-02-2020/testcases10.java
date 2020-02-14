import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases10 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_testcases10.html");
		ExtentTest test= report.startTest("testcases10");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase10.htm");
		driver.findElement(By.id("b1")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		
		String[] s =driver.switchTo().alert().getText().split("Order Number:");
		alert.accept();
		
		driver.findElement(By.id("t1")).sendKeys(s);
		driver.findElement(By.id("b2")).click();
		WebElement result = driver.findElement(By.id("result"));
		String[] s1 = result.getText().split("Test result:");
		String s2= s1[1];
		System.out.println(s2);
		if(s2.equalsIgnoreCase(" Pass") )
		{
			test.log(LogStatus.PASS,"Result is pass" );
		}
		else
		{
			test.log(LogStatus.FAIL, "Result is fail");
		}
		
		Thread.sleep(5000);
		report.endTest(test);
		report.flush();
		driver.quit();

	}

}
