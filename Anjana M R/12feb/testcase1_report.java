package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase1_report {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ExtentReports report=new ExtentReports("test_1.html");
ExtentTest test=report.startTest("TC1");
System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("E:/Anjana/testcases/testcase1.html");
WebElement textbox=driver.findElement(By.id("t1"));
String box="Anjana123";
textbox.sendKeys(box);
driver.findElement(By.id("b1")).click();
String length_of_string=driver.findElement(By.id("t2")).getAttribute("value");

if(box.length()==Integer.parseInt(length_of_string))
{
	test.log(LogStatus.PASS, "pass");
}
else
{
	test.log(LogStatus.FAIL, "fail");
}
Thread.sleep(5000);
report.endTest(test);
report.flush();
driver.quit();
	}

}
