package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ExtentReports report=new ExtentReports("test1.html");
         ExtentTest test=report.startTest("FB_test");
         
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase1.html");
	       WebElement x= driver.findElement(By.id("t1"));
	       String y="ardra";
	       x.sendKeys(y);
	       driver.findElement(By.id("b1")).click();
	       int z=y.length();
	       
	      String str=String.valueOf(z);
	      
	     String x1= driver.findElement(By.id("t2")).getText();
	      
	       
	      if(str.equalsIgnoreCase(x1))	{
	    	  test.log(LogStatus.PASS, "Length and text area data are same");
	      }
	      else	{
	    	  test.log(LogStatus.FAIL, "Length and text area data are defferent");
	      }
	      Thread.sleep(5000);
	      report.endTest(test);
	      report.flush();
	      driver.quit();

	}

}
