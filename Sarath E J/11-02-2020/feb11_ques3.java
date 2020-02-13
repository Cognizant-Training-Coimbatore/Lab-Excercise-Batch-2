package selenium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb11_ques3{

	public static void main(String[] args) throws InterruptedException {
		
		ExtentReports report = new ExtentReports("Report_FB.html");
		ExtentTest test = report.startTest("feb11_ques3");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html.html");
		
	
		int rand = (int)(Math.random() *11);
		
		Select country1 = new Select(driver.findElement(By.id("country1")));
		country1.selectByIndex(rand);
		
		rand = (int)(Math.random()*11) ;
		Select country2 = new Select(driver.findElement(By.id("country2")));
		country2.selectByIndex(rand);
		
		if(country1.getFirstSelectedOption().getText().equals(country2.getFirstSelectedOption().getText()))
		{
			test.log(LogStatus.FAIL, "Same source and destination countries");

		}
		else
		{
			test.log(LogStatus.PASS, "Different source and destination countries");
		}
		
		
		
		report.endTest(test);
		report.flush();
		
		Thread.sleep(2000);
		driver.quit();

	}

}