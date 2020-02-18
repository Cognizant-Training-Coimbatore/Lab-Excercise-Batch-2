package report;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("test_6.a.html");
		ExtentTest test=report.startTest("TC6");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
		WebElement text_box1=driver.findElement(By.id("t1"));
		String s1="Hello";
				text_box1.sendKeys(s1);
				String s2="Hello";
		WebElement text_box2=driver.findElement(By.id("t2"));
		text_box2.sendKeys(s2);
		driver.findElement(By.id("b1")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		System.out.println(s);
		alert.accept(); 
		if(s1.equals(s2))
		{
			if(s.equals("Same"))
			{
			test.log(LogStatus.PASS, "pass");
			}else
			{
				test.log(LogStatus.FAIL, "fail");
			}
		}
		else
		{
			if(s.equals("Not Same"))
			
				test.log(LogStatus.PASS, "pass");
			else
			
				test.log(LogStatus.FAIL, "fail");
			
		}
		report.endTest(test);
		report.flush();
	        driver.quit();
	}

}
