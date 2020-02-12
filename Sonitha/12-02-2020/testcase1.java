import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports report = new ExtentReports("Report_testcase1.html");
		ExtentTest test = report.startTest("FB_test1");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html.htm");
		String str1 = "writing text";
		driver.findElement(By.id("t1")).sendKeys(str1);
		
		driver.findElement(By.id("b1")).click();
		
	//	String s= driver.findElement(By.id("t1")).getAttribute("value");
	//	int s1 = s.length();
		
    //  driver.findElement(By.id("t2")).sendKeys(IntegertoString(s));
	String s = driver.findElement(By.id("t2")).getAttribute("value");
	Integer intobj = Integer.valueOf(s);
    if(str1.length() == intobj)
		{
    	test.log(LogStatus.PASS, "the string length is same");
		}
    else
    {
    	test.log(LogStatus.FAIL, "the string length is not same");
    }
		Thread.sleep(5000);
		
		report.endTest(test);
		report.flush();
		driver.quit();
		
		

	}

}
