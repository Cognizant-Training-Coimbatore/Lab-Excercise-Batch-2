package extentreport1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class a12_2Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results3.html");
		ExtentTest test=report.startTest("a12_2_Testcase3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase3.html");
		Select combo1=new Select(driver.findElement(By.id("country1")));
		combo1.selectByVisibleText("India");
		Select combo2=new Select(driver.findElement(By.id("country1")));
		combo2.selectByVisibleText("USA");

		if(combo1!=(combo2))
		{
			
			test.log(LogStatus.PASS, "Same country not entered");
		}
		else
		{
		test.log(LogStatus.FAIL, "Same country entered");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
