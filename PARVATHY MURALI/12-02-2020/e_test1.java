package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class e_test1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports reports=new ExtentReports("Report.testcase1.html");
		ExtentTest test=reports.startTest("e_test1");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/java%20parvathym/project_selenium/testcase1.html");
		String s="hello";
		driver.findElement(By.id("t1")).sendKeys(s);
		driver.findElement(By.id("b1")).click();
		Thread.sleep(3000);
		WebElement total=driver.findElement(By.id("t2"));
		String t=total.getAttribute("value");
		System.out.println(t);
		if(total!=null)
		{
			test.log(LogStatus.PASS,"displayed the string propertly");
		}
		else
		
			test.log(LogStatus.FAIL,"Did not displayed the  string propertly");
		
		
		if(t.length()==s.length())
		{
			test.log(LogStatus.PASS,"displayed the length of the string propertly");
		}
		else
		
			test.log(LogStatus.FAIL,"Did not displayed the length of the string properly");
		
		reports.endTest(test);
		reports.flush();
		driver.quit();driver.quit();

	}

}
