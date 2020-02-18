package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase6 {
	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports report=new ExtentReports("testcase6.html");
        ExtentTest test=report.startTest("FB_test");
        
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
	       String x="blaaa";
	       driver.findElement(By.id("t1")).sendKeys(x);
	       String y="blaaa";
	       driver.findElement(By.id("t2")).sendKeys(x);
	       driver.findElement(By.id("b1")).click();
	       Thread.sleep(5000);
	       Alert alert=driver.switchTo().alert();
	       alert.accept();
	       if(x.equalsIgnoreCase(y))	{
		    	  test.log(LogStatus.PASS, " two textbox are same");
		      }
		      else	{
		    	  test.log(LogStatus.FAIL, " two textbox are deffrent");
		      }
		      Thread.sleep(5000);
		      report.endTest(test);
		      report.flush();
		      driver.quit();
	}
}
