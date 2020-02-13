package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb13_ques12 {

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("feb13_ques11 ");
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase12.html");
		
		
		driver.findElement(By.id("b1")).click();
		Thread.sleep(2000);
		String str = "hii";
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.id("t1")).sendKeys(str);
		Thread.sleep(2000);
		
		driver.findElement(By.id("b4")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
		if(driver.findElement(By.id("t1")).isEnabled())
		{
		test.log(LogStatus.FAIL, "Text is still enabled");
		System.out.println("Text is still enabled");
		}
		else
		{
		test.log(LogStatus.PASS, "Text is disabled");
		System.out.println("Text is disabled");
		}
		if(str.equals(driver.findElement(By.id("t1")).getAttribute("value")))
			{
			test.log(LogStatus.PASS, "success");
			System.out.println("Success");
			}
		else
			{
			test.log(LogStatus.FAIL, "Fail");
			System.out.println("Success");
			}
		

		report.endTest(test);
		report.flush();		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
