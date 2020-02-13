package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.model.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb13_ques10 {

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("feb13_ques10 ");
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Downloads/testcase10.html");
		
		driver.findElement(By.id("b1")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String a = alert.getText();
		String s = a.replaceAll("[^0-9]+", "");
		alert.accept();
		
		System.out.println(a);
		System.out.println(s);
		
		driver.findElement(By.id("t1")).sendKeys(s);
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("b2")).click();
		Thread.sleep(3000);
		if(a.replaceAll("[^0-9]+", "").equals(s))
		{
			test.log(LogStatus.PASS, "Both are same");
		}
		else
		{
			test.log(LogStatus.FAIL, "Both are different");
		}
		report.endTest(test);
		report.flush();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
