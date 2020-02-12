package feb_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase3.html");
		ExtentTest test= report.startTest("testcase3");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html.htm");
		Select country=new Select(driver.findElement(By.id("country1")));
		country.selectByVisibleText("India");
		Select countryto=new Select(driver.findElement(By.id("country2")));
		countryto.selectByVisibleText("India");
		if(country.getFirstSelectedOption().getText().contentEquals(countryto.getFirstSelectedOption().getText()))
		{
			
			test.log(LogStatus.FAIL, "From and to are same");
		}
		else
		{
			test.log(LogStatus.PASS, "From and to are different");
		}
		Thread.sleep(3000);
		report.endTest(test);
		report.flush();
		driver.quit();
		
		

	}

}
