package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class feb12_ques7 {

	public static void main(String[] args) throws InterruptedException
	{
		//ExtentReports report = new ExtentReports("Report_FB.html");
		//ExtentTest test = report.startTest("feb12_ques7");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
	
		driver.get("file:///C:/Users/Admin/Downloads/testcase7.html");
		 //WebDriverWait wait = new WebDriverWait(driver, 5);
		 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body")));
		 WebElement a = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		 WebElement b = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
		
		//Thread.sleep(2000);
		
		action.dragAndDrop(a,b).build().perform();
		 
		 
		 
		 	//report.endTest(test);
			//report.flush();
			Thread.sleep(2000);
			driver.quit();
		
		
		
	}

}
