package extentreport1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FB_TEST {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("d://Report_FB_Results.html");
		ExtentTest test=report.startTest("FB_TEST");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement uid=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		uid.sendKeys("kyuvrajcs");
		pass.sendKeys("kyuvrajcs");

		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/today/tr[2]/td[3]"));
if((uid!=null )&&(pass!=null))
{
	test.log(LogStatus.PASS, "The values are not empty");
}
else
{
	test.log(LogStatus.FAIL, "The values are empty");
}
	
report.endTest(test);
report.flush();
driver.quit();


			}
}
