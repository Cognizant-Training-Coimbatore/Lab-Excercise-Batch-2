package report;

import javax.swing.text.AbstractDocument.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.implementation.EqualsMethod;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_3.html");
		ExtentTest test=report.startTest("TC3");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Admin/Downloads/testcase3.html");
		Select country_1=new Select(driver.findElement(By.id("country1")));
		country_1.selectByVisibleText("India");
		Select country_2=new Select(driver.findElement(By.id("country2")));
		country_2.selectByVisibleText("India");
		//	country_2.selectByVisibleText("Tibet");----for pass
		String s1=country_1.getFirstSelectedOption().getText();
		String s2=country_2.getFirstSelectedOption().getText();
		if((s1).contentEquals(s2))
		{
			test.log(LogStatus.FAIL,"fail");
		}
		else
		{
			test.log(LogStatus.PASS, "pass");
		}
		report.endTest(test);
		report.flush();
	        driver.quit();
	}

}
