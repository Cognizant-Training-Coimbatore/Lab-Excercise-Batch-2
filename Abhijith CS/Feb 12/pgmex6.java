import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgmex6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("rep_ex6.html");
		ExtentTest test=report.startTest("pgmex6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase6.html");
		WebElement tb1= driver.findElement(By.id("t1"));
		tb1.sendKeys("hello");
		WebElement tb2= driver.findElement(By.id("t2"));
		tb2.sendKeys("hai");
		driver.findElement(By.id("b1")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		if(tb1.getAttribute("value").equals(tb2.getAttribute("value")))
		{
			test.log(LogStatus.PASS, "Strings are equal");
		}
		else
		{
			test.log(LogStatus.FAIL, "Strings are not equal");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();
	}

}
