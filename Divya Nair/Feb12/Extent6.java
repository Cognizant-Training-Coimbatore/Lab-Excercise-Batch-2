package repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent6 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report.testcase6.html");
		ExtentTest test=report.startTest("Extent6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/testcase6.html");
		WebElement text1=driver.findElement(By.id("t1"));
		text1.sendKeys("I love Java");
		String s=text1.getAttribute("value");
		Thread.sleep(2000);
		WebElement text2=driver.findElement(By.id("t2"));
		text2.sendKeys("I love Java");
		String t=text2.getAttribute("value");
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.id("b1"));
		btn.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		if(s.equals(t))
		{
			test.log(LogStatus.PASS, "Both the texts are same");
		}
		else
			test.log(LogStatus.FAIL, "Both the texts are not same");
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
	}

}
