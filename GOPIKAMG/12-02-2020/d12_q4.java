package repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class d12_q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase4.html");
	    ExtentTest test=report.startTest("d12_q4");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("file:///C:/Users/admin/Downloads/testcase4.html");
	 	WebElement option1=driver.findElement(By.id("c1"));
	 	option1.click();
	 	Alert alert=driver.switchTo().alert();
	 	driver.switchTo().alert().sendKeys("Mahabharatha");
	 	Thread.sleep(5000);
	 	 alert.accept();
	 	String s=driver.findElement(By.id("t1")).getAttribute("value");
	    if(s.contains("Mahabharatha"))
	    {
	    	 test.log(LogStatus.PASS, "pass");
	     	
	    }
	    else
	    {
	    	  test.log(LogStatus.FAIL, "fail");
	    }
	    report.endTest(test);
		report.flush();
		Thread.sleep(5000);
	 	driver.quit();
	}

}
