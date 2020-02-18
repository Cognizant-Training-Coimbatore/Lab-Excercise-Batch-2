import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase1 {

	public static void main(String[] args) 
	{
		ExtentReports report = new ExtentReports("Report_testcase1.html");
		ExtentTest test = report.startTest("testcase1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase1.html");
		String a = "shaheen";
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.sendKeys(a);
		int l = a.length();
		WebElement click = driver.findElement(By.id("b1"));
		click.click();
		WebElement t2 = driver.findElement(By.id("t2"));
		String value = t2.getAttribute("value");
		int i = Integer.parseInt(value);
		if(l == i)
		{
			test.log(LogStatus.PASS, "Passed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Failed");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
