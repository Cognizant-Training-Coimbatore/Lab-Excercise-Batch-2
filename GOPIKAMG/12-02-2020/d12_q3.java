package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class d12_q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase3.html");
	    ExtentTest test=report.startTest("d12_q3");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("file:///C:/Users/admin/Downloads/testcase.3.html.htm");
	 	Select product=new Select(driver.findElement(By.id("country1")));
	 	 product.selectByVisibleText("India");
	 	Select product1=new Select(driver.findElement(By.id("country2")));
	 	 product1.selectByVisibleText("India");
	 	 String s=product.getFirstSelectedOption().getText();
	 	String s1=product1.getFirstSelectedOption().getText();
	 	//String s=driver.findElement(By.id("country1")).getAttribute("value");
	   // String s1=driver.findElement(By.id("country2")).getAttribute("value");
	    if(s.equalsIgnoreCase(s1))
	    {
	        test.log(LogStatus.FAIL, "fail");
	    }
	    	
	     else
	 	
	         
	
	    test.log(LogStatus.PASS, "pass");
    	

		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		driver.quit();
	}

}
