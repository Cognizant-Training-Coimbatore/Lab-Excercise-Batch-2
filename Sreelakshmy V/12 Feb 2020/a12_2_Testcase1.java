package extentreport1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class a12_2_Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results1.html");
		ExtentTest test=report.startTest("a12_2_Testcase1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html");
		driver.findElement(By.id("t1")).sendKeys("gfdr");
		WebElement ck=driver.findElement(By.id("b1"));
				ck.click();
if((ck!=null))
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
