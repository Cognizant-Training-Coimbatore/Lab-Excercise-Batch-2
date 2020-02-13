package Testcases_11_Feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report3.html");
		ExtentTest test=report.startTest("Extended_reports");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/TestCases_11Feb/testcase3.html.htm");
		Select country1= new Select(driver.findElement(By.id("country1")));

		country1.selectByIndex(0);
		Thread.sleep(1000);
		String str= country1.getFirstSelectedOption().getText();
		Select country2= new Select(driver.findElement(By.id("country2")));
		country2.selectByVisibleText(str);
		Thread.sleep(1000);
		do {
			int r=(int)(Math.random()*11);
		if(str.equals(country2.getFirstSelectedOption().getText()))
		{
				test.log(LogStatus.FAIL, "Source and destination should not be the same");
				System.out.println("Source and destination should not be the same");
				country2.selectByIndex(r);
		}
			else
				test.log(LogStatus.PASS, "Source and destination is different");
		}while(country2.getFirstSelectedOption().getText()==str);				
		Thread.sleep(3000);
		report.endTest(test);
		report.flush();
		driver.quit();


	}

}
