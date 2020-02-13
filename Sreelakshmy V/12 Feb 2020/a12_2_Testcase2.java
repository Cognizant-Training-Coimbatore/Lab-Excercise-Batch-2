package extentreport1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class a12_2_Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results2.html");
		ExtentTest test=report.startTest("a12_2_Testcase1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase2.html");
		Select combo1=new Select(driver.findElement(By.id("country")));
		WebElement id=driver.findElement(By.id("t1"));
				id.sendKeys("(combo1.getOptions().size())");
				if((id!=null))
				{
					
					test.log(LogStatus.PASS, "The number is correct");
				}
				else
				{
				test.log(LogStatus.FAIL, "The number isnt correct");
				}
				report.endTest(test);
				report.flush();
				driver.quit();


		
	}

}
