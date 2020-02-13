import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report6.html");
		ExtentTest test=report.startTest("testcase6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("E:\\JIJO A J\\ECLIPSE\\D4\\src\\testcase6.html");
		WebElement table =driver.findElement(By.id("t1"));
		WebElement table2 =driver.findElement(By.id("t2"));
		table.sendKeys("messi");
		table2.sendKeys("messi");
		WebElement btn =driver.findElement(By.id("b1"));
		btn.click();
		
		if(table2.getAttribute("value").equals(table.getAttribute("value")))
			test.log(LogStatus.PASS, "Both text same");
		else
			test.log(LogStatus.FAIL, "texts not same");
		Thread.sleep(1000);
		report.endTest(test);
		report.flush();
		
		driver.quit();
		
	}

}
