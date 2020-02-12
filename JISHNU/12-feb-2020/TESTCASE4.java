package feb_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase4.html");
		ExtentTest test=report.startTest("testcase4");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html.htm");
		driver.findElement(By.id("c1")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Harry");
		alert.accept();
		
		String str=driver.findElement(By.id("t1")).getAttribute("value").toString();
		
		if(str.contains("Harry"))
		{
			System.out.println("Same test copied in to the text box");
			test.log(LogStatus.PASS, "same text copied");
		}
		else
		{
			test.log(LogStatus.FAIL, "different text");
		}
		Thread.sleep(3000);
		report.endTest(test);
		report.flush();
		
		driver.quit();

	}

}
