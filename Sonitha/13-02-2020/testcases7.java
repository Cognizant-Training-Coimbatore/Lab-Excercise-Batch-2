import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases7 
{

	public static void main(String[] args) 
	{
	   ExtentReports report = new ExtentReports("Report_testcases7.html");
	   ExtentTest test = report.startTest("testcases7");
	   
	   
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("file:///C:/Users/Admin/Downloads/testcase7%20(1).htm");
	   

	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	   
	   Actions action = new Actions(driver);
	   
	   WebElement source = driver.findElement(By.id("drag1"));
	   WebElement target = driver.findElement(By.id("div1"));
	   action.moveToElement(target).build().perform();
	   target.click();
	   action.dragAndDrop(source, target).build().perform();
        if(target ==driver.findElement(By.xpath("//*[@id=\"drag1\"]")))
        {
        	test.log(LogStatus.PASS, "the expected position ");
        	
        }else
        {
        	test.log(LogStatus.FAIL, "not as expected");
        }
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
