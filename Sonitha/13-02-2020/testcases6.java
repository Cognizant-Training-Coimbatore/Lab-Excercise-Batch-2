import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcases6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ExtentReports report = new ExtentReports("Report_testcase6.html");
		ExtentTest test =report.startTest("testcase6");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase6.htm");
		WebElement e1,e2,e3;
		
		e1=driver.findElement(By.xpath("//*[@id=\"t1\"]"));
		e1.sendKeys("textbox1");
		String s1 = e1.getAttribute("value");
		
		e2=driver.findElement(By.xpath("//*[@id=\"t2\"]"));
		e2.sendKeys("textbox2");
		String s2 = e2.getAttribute("value");
		
		e3=driver.findElement(By.xpath("//*[@id=\"b1\"]"));
		e3.click();
		
		
		if(s1.equalsIgnoreCase(s2))
		{
			test.log(LogStatus.PASS,"The text are same");
			System.out.println("The text are same");
		}
		else
		{
			test.log(LogStatus.FAIL,"The text are not same");
			System.out.println("The text are not same");
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
         report.endTest(test);
         report.flush();
         driver.quit();
	}

}
