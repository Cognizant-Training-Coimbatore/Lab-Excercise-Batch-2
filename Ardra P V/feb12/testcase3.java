package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ExtentReports report=new ExtentReports("External.html");
         ExtentTest test=report.startTest("FB_test");
         
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/testcase.3.html.htm");
	       Select product=new Select(driver.findElement(By.id("country1")));
	       String x="Egypt";
	       product.selectByVisibleText(x);
	       String y="India";
	      Select product1=new Select(driver.findElement(By.id("country2")));
	       product1.selectByVisibleText(y);
	     
	      if(x.equalsIgnoreCase(y))	{
	    	  test.log(LogStatus.FAIL, "sourse and destination cannot be same");
	      }
	      else	{
	    	  test.log(LogStatus.PASS, "credential is correct");
	      }
	      Thread.sleep(5000);
	      report.endTest(test);
	      report.flush();
	      driver.quit();
	      }

}
