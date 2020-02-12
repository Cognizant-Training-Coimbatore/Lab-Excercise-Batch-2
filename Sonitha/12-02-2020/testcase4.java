

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("Report_testcases4.html");
		ExtentTest test = report.startTest("testcase4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html.htm");
		
        List<WebElement> ele1 = driver.findElements(By.tagName("input"));
        ele1.get(0).click();
        
		
		Alert alert = driver.switchTo().alert();
	    driver.switchTo().alert().sendKeys("aadghdf");
	    String s1 = driver.switchTo().alert().getText();
		alert.accept();
		String s="aadghdf";
		
				

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"t1\"]"));
		System.out.println(ele.getAttribute("value"));
		if((ele.getAttribute("value")).contains(s))
		{
			test.log(LogStatus.PASS, "the text are same");
		}
		else
		{
			test.log(LogStatus.FAIL, "the text are not same");
		}
		

		report.endTest(test);
		report.flush();
       driver.quit();

	}

}
