package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("report1.html");
		ExtentTest test=report.startTest("feb12_1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html.html");
		WebElement uid=driver.findElement(By.id("t1"));
		//uid.sendKeys("stani");
		String s=uid.getAttribute("value");
	driver.findElement(By.id("b1")).click();
	
		Thread.sleep(5000);
		if(s.length()!=0)
		{
			test.log(LogStatus.PASS,"The values are not empty");
		}
		else
		{
			test.log(LogStatus.FAIL, "The values are empty");
		}
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}

}
