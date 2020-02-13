package Testcases_11_Feb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report10.html");
		ExtentTest test = report.startTest("TestCase10");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/TestCases_11Feb/testcase10.html");
		driver.findElement(By.id("b1")).click();		
	
		Alert alert=driver.switchTo().alert();
		String str = alert.getText();
		String numberOnly= str.replaceAll("[^0-9]", "");
		alert.accept();
		System.out.println(numberOnly);
		driver.findElement(By.id("t1")).sendKeys(numberOnly);		
		driver.findElement(By.id("b2")).click();	

		Thread.sleep(2000);
		
		test.log(LogStatus.PASS, driver.findElement(By.id("result")).getAttribute("value"));

		
		report.endTest(test);
		report.flush();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
