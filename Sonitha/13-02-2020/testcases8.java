import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases8 
{

	public static void main(String[] args) 
	{
		ExtentReports report = new ExtentReports("Report_testcases8.html");
		ExtentTest test = report.startTest("testcases8");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase8.htm");
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div/button"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
		
		driver.findElement(By.linkText("Google")).click();
		
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"t");
		
		ArrayList  tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String)tabs.get(0));
		if(driver.getTitle().equalsIgnoreCase("Google"))
		{
			test.log(LogStatus.PASS, "the program is as expected");
			
		}
		else
		{
			test.log(LogStatus.FAIL, "the program runs not as expected");
		
			
		}
		
		
		report.endTest(test);
		report.flush();
		
		driver.quit();


	}

}
