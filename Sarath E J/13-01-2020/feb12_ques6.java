package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_ques6 {

	public static void main(String[] args) throws InterruptedException
	{
		
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("feb12_ques6");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String s1 = "sarath";
		String s2 = "sarat";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		
		 driver.findElement(By.id("t1")).sendKeys(s1);
		 //driver.findElement(By.id("t2")).clear();
		 driver.findElement(By.id("t2")).sendKeys(s2);
		Thread.sleep(2000);
		driver.findElement(By.id("b1")).click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		String a = alert.getText();
		alert.accept();
		Thread.sleep(2000);
		System.out.println(a);
		if(s1.equals(s2))
		{
			test.log(LogStatus.PASS, "Both are same");
		}
		else
		{
			test.log(LogStatus.FAIL, "Both are different");
		}
		
		
		report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
