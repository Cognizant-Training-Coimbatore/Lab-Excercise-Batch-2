package selenium;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class feb11_ques1 {

	public static void main(String[] args) throws InterruptedException 
	{	
		ExtentReports rep = new ExtentReports("Report_FB.html");
	    ExtentTest test = rep.startTest("feb11_ques1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html.html");
		String str="hello";

		
		driver.findElement(By.id("t1")).sendKeys(str);
		Thread.sleep(5000);
		driver.findElement(By.id("b1")).click();
		WebElement sea = driver.findElement(By.xpath("//*[@id=\"t2\"]"));
		
		if(Integer.parseInt(sea.getAttribute("value"))==(str.length()))
		{
			test.log(LogStatus.PASS, "Ensured that both values are same");
			System.out.println("pass");
		}
		else
		{

			test.log(LogStatus.FAIL, "Not same");
			System.out.println("fail");
		}
		
		rep.endTest(test);
		rep.flush();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	
	}

}
