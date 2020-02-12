package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class d12_q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_testcase2.html");
	    ExtentTest test=report.startTest("d12_q2");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("file:///C:/Users/admin/Downloads/testcase2.html");
	 	Select product=new Select(driver.findElement(By.id("country1")));
		int size=product.getOptions().size();
		WebElement t1=driver.findElement(By.id("t1"));
		t1.sendKeys(Integer.toString(size));
	  if(size==11)
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
