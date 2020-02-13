package Testcases_11_Feb;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report6.html");
		ExtentTest test=report.startTest("Extended_reports");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/TestCases_11Feb/testcase6.html");
		
		WebElement t1= driver.findElement(By.id("t1"));
		WebElement t2= driver.findElement(By.id("t2"));
		t1.sendKeys("ABCD");
		t2.sendKeys("ABCD");
		driver.findElement(By.id("b1")).click();
		Alert alert=driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		alert.accept();
		if(str.equals("Same"))
		{
		System.out.println("Contents are same");
		test.log(LogStatus.PASS, "Contents are same");
		}
		else if(str.equals("Not same"))
		{
		System.out.println("Contents are not same");
		test.log(LogStatus.FAIL, "Contents are not same");
		}
		Thread.sleep(2000);
		report.endTest(test);
		report.flush();
		driver.quit();		
	}

}
