package Testcases_11_Feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase08 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Report08.html");
		ExtentTest test = report.startTest("TestCase08");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("file:///D:/TestCases_11Feb/testcase8.html");
		WebElement drop=driver.findElement(By.xpath("/html/body/div/button"));

		Actions actions=new Actions(driver);
		actions.moveToElement(drop).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google")).click();

		Thread.sleep(4000);
		
		if(driver.getTitle().equals("Google"))
		{
		System.out.println("Google");
		test.log(LogStatus.PASS, "Verified");
		}
		else
		{
		System.out.println("Failure");
		test.log(LogStatus.FAIL, "Failed to move to Google page");
		}
		Thread.sleep(2000);
		report.endTest(test);
		report.flush();
		driver.quit();		
	
	
	}

}
