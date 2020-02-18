package basic_command;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase6.html");
		ExtentTest test=report.startTest("testcase6");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase6.html");
		WebElement text1=driver.findElement(By.id("t1"));
		text1.sendKeys("hello");
		WebElement text2=driver.findElement(By.id("t2"));
		text2.sendKeys("hai");
		driver.findElement(By.id("b1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		if(text1.getAttribute("value").equals(text2.getAttribute("value")))
		{
			test.log(LogStatus.PASS,"Strings are equal");
		}
		else
		{
			test.log(LogStatus.FAIL,"Strings are not equal");
		
		}
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
