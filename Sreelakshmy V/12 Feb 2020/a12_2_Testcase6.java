package extentreport1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class a12_2_Testcase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results6.html");
		ExtentTest test=report.startTest("a12_2_Testcase6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase6.html");
		WebElement ew=driver.findElement(By.id("t1"));
		ew.sendKeys("asdfg");
		WebElement ep=driver.findElement(By.id("t2"));
		
		ep.sendKeys("ashh");
		driver.findElement(By.id("b1")).click();
		Alert al3=driver.switchTo().alert();
		String s=al3.getText();
		al3.accept();
		
		if(s!="Not same") {
			test.log(LogStatus.PASS, "Not same");
		}
		else
		{
		test.log(LogStatus.FAIL, "same");
		}
		report.endTest(test);
		report.flush();
		}
	}


