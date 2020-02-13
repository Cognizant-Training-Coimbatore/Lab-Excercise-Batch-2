package exercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb12_Q3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ExtentReports report = new ExtentReports("hello.html");
		ExtentTest test = report.startTest("feb12_Q3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Downloads/testcase.3.html.htm");
		
		
		 
		int rand = (int)(Math.random()*11);
		
		Select combo1 = new Select(driver.findElement(By.id("country1")));
		combo1.selectByIndex(rand);
		
		rand = (int)(Math.random()*11);
		Select combo2 = new Select(driver.findElement(By.id("country2")));
		combo2.selectByIndex(rand);
		
		if(combo1.getFirstSelectedOption().getText().equals(combo2.getFirstSelectedOption().getText()))
		{
			test.log(LogStatus.FAIL, "Same source and destination countries");
			System.out.println("FAIL");
		}
		else
		{
			test.log(LogStatus.PASS, "Different source and destination countries");
			System.out.println("PASS");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();

	}

}
