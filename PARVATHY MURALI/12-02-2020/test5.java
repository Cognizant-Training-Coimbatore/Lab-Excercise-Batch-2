package project_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test5 {

	public static void main(String[] args) throws InterruptedException
	{
		ExtentReports reports=new ExtentReports("Report.testcase5.html");
		ExtentTest test=reports.startTest("test5");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement tb=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> col= tb.findElements(By.tagName("td"));
		System.out.println(col.size());
		Thread.sleep(3000);
		driver.findElement(By.name("r1")).click();
		Thread.sleep(3000);
		if(table!=null)
		{
			test.log(LogStatus.PASS, "SUCCESS");
		}
		else
			
			test.log(LogStatus.FAIL, "INPUTS AND TEXTBOX DID NOT MATCH");

		reports.endTest(test);
		reports.flush();
		driver.quit();
		
		
	}

}
