
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_country.html");
		ExtentTest test=report.startTest("testcase2");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Downloads/testcase2.html");
Select qw=new Select(driver.findElement(By.id("country")));
String a=""+qw.getOptions().size();
System.out.println(a);

driver.findElement(By.id("t1")).sendKeys(a);

Thread.sleep(3000);
if(qw.getOptions().size()==11)
{
	test.log(LogStatus.PASS,"the values are not empty" );
		
		
}
	else
		
	{
		test.log(LogStatus.FAIL, "the values are empty");
		}

report.endTest(test);
report.flush();
driver.quit();

	}

}
