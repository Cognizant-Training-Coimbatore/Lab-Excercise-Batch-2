package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class d12_q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("Report_testcase1.html");
	    ExtentTest test=report.startTest("d12_q1");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("file:///C:/Users/admin/Downloads/testcase1.html");
		WebElement t1=driver.findElement(By.id("t1"));
		WebElement t2=driver.findElement(By.id("t2"));
		t1.sendKeys("gopikagopan");
		driver.findElement(By.id("b1")).click();
	    String s=driver.findElement(By.id("t1")).getAttribute("value");
	    String s1=driver.findElement(By.id("t2")).getAttribute("value");
	    
	     if(s.length()==Integer.parseInt(s1))
	    {
	    	 test.log(LogStatus.PASS, "pass");
	    	
	    }
	    	
	     else
	 		test.log(LogStatus.FAIL, "fail");
		

		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		driver.quit();
		}
		
	}


