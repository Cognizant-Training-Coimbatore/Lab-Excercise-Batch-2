import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		ExtentReports report=new ExtentReports("Report_hobby.html");
		ExtentTest test=report.startTest("testcase4");
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Downloads/testcase4.html");
driver.findElement(By.id("c1")).click();
Alert alert=driver.switchTo().alert();

alert.sendKeys("JESTIN COLIN CORREYA");
Thread.sleep(3000);
alert.accept();
Thread.sleep(3000);
String str=driver.findElement(By.id("t1")).getAttribute("value").toString();
if(str.contains("JESTIN COLIN CORREYA"))
{
	
		test.log(LogStatus.PASS,"the alert box contains the same text as in text box " );
			
			
	}
		else
			
		{
			test.log(LogStatus.FAIL, "they are not same");
			}

Thread.sleep(5000);
report.endTest(test);
report.flush();

driver.quit();

	}

}
