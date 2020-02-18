package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ExtentReports report=new ExtentReports("popup.html");
         ExtentTest test=report.startTest("FB_test");
         
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase4.html");
	       WebElement op1=driver.findElement(By.id("c1"));
	       op1.click();
	      
	      Alert alert=driver.switchTo().alert();
	      String x=" : novels";
	      alert.sendKeys(x);
	      alert.accept();
	      
	    	   Thread.sleep(5000);
	    
	    String y=driver.findElement(By.id("t1")).getText();	   
			      
	    if(x.equalsIgnoreCase(y))	{
	    	  test.log(LogStatus.PASS, " pop box and text area value are same");
	      }
	      else	{
	    	  test.log(LogStatus.FAIL, " pop box and text area value are deffrent");
	      }
	      Thread.sleep(5000);
	      report.endTest(test);
	      report.flush();
	      driver.quit();
	       
	       

	}

}
