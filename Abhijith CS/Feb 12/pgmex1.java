import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgmex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex1.html");
		ExtentTest test=report.startTest("pgmex1");
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ABHIJITH%20C%20S/exercise/testcase1.html.html");
		WebElement us= driver.findElement(By.id("t1"));
		us.sendKeys("username1");
		driver.findElement(By.id("b1")).click();
		String s = us.getAttribute("value");
		if(s.length() != 0)
		{
			test.log(LogStatus.PASS, "Not empty");
		}
		else
		{
			test.log(LogStatus.FAIL, "empty");
		}
		report.endTest(test);
		report.flush();
	
	System.out.println("The value of textbox is " + s);
	driver.quit();
	}
}
