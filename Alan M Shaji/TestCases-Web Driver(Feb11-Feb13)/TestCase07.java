package Testcases_11_Feb;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report =new ExtentReports("Report7.html");
		ExtentTest test=report.startTest("Extended_reports");
	     
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.get("file:///D:/TestCases_11Feb/testcase7.html");

		//Element which needs to drag.    		
    	WebElement From=driver.findElement(By.id("drag1"));	
     
     //Element on which need to drop.		
     WebElement To=driver.findElement(By.id("div1"));					
     Actions builder = new Actions(driver);
     builder.clickAndHold(From).moveToElement(To).build();
     builder.dragAndDrop(From, To).perform();
     
     // new Actions(driver).dragAndDrop(From, To).build().perform();
     //Actions builder = new Actions(driver);
     //Action drag = builder.clickAndHold(From).moveToElement(To).release(To).build();
     //drag.perform();     
     //Using Action class for drag and drop.
 //    Actions builder=new Actions(driver);					
//builder.dragAndDrop(From, To);
//builder.dragAndDropBy(From, 90, 0);
//Dragged and dropped.	
  //   builder.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
	/*	
		if(t1.getAttribute("value").equals(t2.getAttribute("value")))		
		{
			System.out.println("Strings are same");
			test.log(LogStatus.PASS, "Strings are same");
		}
		else
			test.log(LogStatus.FAIL, "Strings are not same");
	
		report.endTest(test);
		report.flush();
	*/
		Thread.sleep(3000);

     driver.quit();
		
	}

}
